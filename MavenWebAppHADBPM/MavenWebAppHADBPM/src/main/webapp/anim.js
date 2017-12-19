$(document).ready(function () {

    var cards = document.getElementsByClassName("card");

    var cpt = 0;
    var clic = function () {
        $('.card').each(function () {
            $(this).click(function () {
                var idlength = $(this).attr('id').length;
                var id = parseInt(($(this).attr('id')).substring(4, idlength)) + 1;
                var haut = ($(window).height() / 2) - ($('.section').height() / 2);
                var gauche = ($(window).width() / 2) - ($('.section').width() / 2);


                if ($(this).attr('id') === 'ajoutPat') {
                    window.location.assign('addPatient.jsp');
                } else {

                    // Style de l'arrière plan lors du clic sur une card
                    var styleCSS = {'z-index': '10', 'position': 'fixed', 'background-color': 'grey', 'opacity': '0.65', 'left': '0px', 'top': '0px', 'bottom': '0px', 'right': '0px', 'visibility': 'hidden', 'display': 'none'};

                    // Style de l'arrière plan lors du clic sur une card quand l'ecran est grisé
                    var styleCSS2 = {'z-index': '10', 'position': 'fixed', 'background-color': 'grey', 'opacity': '0.65', 'left': '0px', 'top': '0px', 'bottom': '0px', 'right': '0px', 'visibility': 'visible', 'display': 'block'};

                    // Style à appliquer aux informations appartenant au patient quand les informations sont affichées à l'écran
                    var styleCSS3 = {'z-index': '15', 'position': 'fixed', 'top': haut + 'px', 'left': gauche + 'px', 'width': '70%', 'visibility': 'hidden', 'display': 'none'};

                    // Style à appliquer aux informations appartenant au patient quand les informations du patient ne sont pas affichées
                    var styleCSS4 = {'z-index': '15', 'position': 'fixed', 'top': haut + 'px', 'left': gauche + 'px', 'width': '70%', 'visibility': 'visible', 'display': 'block'};


                    // Affiche les info pour le patient sélectionné*

                    if ($('#info_' + id).is(":visible")) {
                        $(this).children('.back-info').children('.info').css(styleCSS);
                        $('#info_' + id).css(styleCSS3);
                    } else {
                        $(this).children('.back-info').children('.info').css(styleCSS2);
                        $('#info_' + id).css(styleCSS4);
                    }
                    // Affiche un plan transparent à 65%
                    //$(this).children('.back-info').children('.info').css(styleCSS);

                }
            });
        });

    };
    //var autocomplete = function(input) {
    console.log('passage dans la fonction qui fait tout');
    //console.log(input);
    var val = $.ajax({
        url: 'SearchPatient',
        method: 'GET',
        success: function (data) {

            return val;

        }, dataType: 'json',
        async: false
    });
    console.log(val.responseJSON);
    var data = val.responseJSON;
    var id = 0;
    // datatable for the autocomplete
    //var tab = '{';
    var tab;
    for (id; id < data.patients.length; id++) {
        if (id > 0) {
            tab += ',';
        }
        tab += "\"" + data.patients[id].name + "\": null";
        // Changes the cards
        var card = '<div class="pat col s12 m3">' +
                '<div id="pat-' + id + '" class="card">' +
                '<div class="card-image">' +
                '<img src="images/sample-1.jpg" height="100">' +
                '<span class="card-title">Card Title</span>' +
                '<a class="btn-floating halfway-fab waves-effect waves-light red">' +
                '<i class="material-icons">add</i>' +
                '</a>' +
                '</div>' +
                '<div class="card-content">' +
                '<p>' + data.patients[id].name + '</p>' +
                '</div>' +
                '<div class="back-info">' +
                '<div class="info" style="visibility: hidden; display: none;">' +
                '<p>Informations sur le patient</p>' +
                '</div>' +
                '</div>' +
                '</div>' +
                '</div>';

        // Add the cards to the page again with style !!!
        $('#place').append(card);
        $('#pat-' + id).hide();
        $('#pat-' + id).show(500);

    }

    tab += '}';
    var ess = {};
    $(data.patients).each(function () {
        ess[this.name] = null;
    });


    // Give the Patient table to the autocomplete
    $('input.autocomplete').autocomplete({
        data: ess,
        limit: 10, // The max amount of results that can be shown at once. Default: Infinity.

        minLength: 1 // The minimum length of the input for the autocomplete to start. Default: 1.
    });

    clic();


    $('.collapsible').collapsible();


});