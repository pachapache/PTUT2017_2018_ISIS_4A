$(document).ready(function () {

    var cards = document.getElementsByClassName("card");
    
    // Créé la carte d'un patient
    var card = function (id, pat) {
        // the card
        var c = '<div class="pat col s12 m3">' +
                '<div id="pat-' + id + '" class="pat card">' +
                '<div class="card-image">' +
                '<img src="images/sample-1.jpg" height="100">' +
                '<span class="card-title">Card Title</span>' +
                '<a class="btn-floating halfway-fab waves-effect waves-light red">' +
                '<i class="material-icons">add</i>' +
                '</a>' +
                '</div>' +
                '<div class="card-content">' +
                '<p>' + pat + '</p>' +
                '</div>' +
                '<div class="back-info">' +
                '<div class="info" style="visibility: hidden; display: none;">' +
                '<p>Informations sur le patient</p>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>';

        // Add the cards to the page again with style !!!
        $('#place').append(c);
        // Make an effect
        $('#pat-' + id).hide();
        $('#pat-' + id).show(500);

    };

    // Performed every time a card is created
    var clic = function () {
        $('.card').each(function () {
            $(this).click(function () {
                // Variable with the complete id
                var idlength = $(this).attr('id').length;
                // Id of the actual element
                var id = parseInt(($(this).attr('id')).substring(4, idlength)) + 1;
                // Place the element
                var haut = ($(window).height() / 2) - ($('.section').height() / 2);
                var gauche = ($(window).width() / 2) - ($('.section').width() / 2);

                // Check where the user has clicked
                if ($(this).attr('id') === 'ajoutPat') {
                    window.location.assign('addPatient.jsp');
                } else {

                    // CSS style to hide informations
                    var hideInfo = {'z-index': '10', 'position': 'fixed', 'background-color': 'grey', 'opacity': '0.65', 'left': '0px', 'top': '0px', 'bottom': '0px', 'right': '0px', 'visibility': 'hidden', 'display': 'none'};

                    // Create a grey background when the user clicks on a card
                    var showInfo = {'z-index': '10', 'position': 'fixed', 'background-color': 'grey', 'opacity': '0.65', 'left': '0px', 'top': '0px', 'bottom': '0px', 'right': '0px', 'visibility': 'visible', 'display': 'block'};

                    // Hide the information displayed when the user clicks on the page
                    var HideCollapsible = {'z-index': '15', 'position': 'fixed', 'top': haut + 'px', 'left': gauche + 'px', 'width': '70%', 'visibility': 'hidden', 'display': 'none'};

                    // Display the collapsible of the patient
                    var showCollapsible = {'z-index': '15', 'position': 'fixed', 'top': haut + 'px', 'left': gauche + 'px', 'width': '70%', 'visibility': 'visible', 'display': 'block'};


                    // Display the informations for the selected patient
                    if ($('#info_' + id).is(":visible")) { // check if the information are visible
                        // 
                        $(this).children('.back-info').children('.info').css(hideInfo);
                        $('#info_' + id).css(HideCollapsible);
                    } else {
                        $(this).children('.back-info').children('.info').css(showInfo);
                        $('#info_' + id).css(showCollapsible);
                    }
                }
            });
        });
    };


    // Retrieve all the patients in the owl
    var val = $.ajax({
        url: 'SearchPatient',
        method: 'GET',
        success: function (data) {
            return val;
        }, dataType: 'json',
        async: false
    });

    // Data retrieved by the ajax call
    var data = val.responseJSON;
    // Counter
    var id = 0;
    // Patient for the autocomplete
    var ess = {};
    $(data.patients).each(function () {
        // Limit the number of card on the page
        if (id < 12) {
            // create the card for the patient
            card(id, this.name);
        }
        id++;
    });

    // Give the Patient table to the autocomplete
    $('input.autocomplete').autocomplete({
        data: ess,
        limit: 10, // The max amount of results that can be shown at once. Default: Infinity.

        minLength: 1 // The minimum length of the input for the autocomplete to start. Default: 1.
    });

    // Make all the cards clickable
    clic();

    // Change the cards according to what is given by the input
    $('input.autocomplete').on('input', function () {

        var filt = {};
        // Value of the autocomplete
        var pers = $(this).val();
        
        // Counter
        var i = 0;
        $('.pat').each(function() {
                $(this).hide();
            });
        // Look for the value among the patients
        $(data.patients).each(function () {
            if (pers.length > 0) {
                // The value is in the data
                if (this.name.indexOf(pers) !== -1) {                    
                    // Display the card
                    card(i,this.name);
                    i++;
                }
            }

        });
        clic();
    });

    // Initialise the collapsible
    $('.collapsible').collapsible();
});