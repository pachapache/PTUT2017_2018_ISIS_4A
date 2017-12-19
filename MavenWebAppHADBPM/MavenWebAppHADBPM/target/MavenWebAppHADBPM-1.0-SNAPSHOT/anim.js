$(document).ready(function(){
        var cards = document.getElementsByClassName("card");

        var i = 0;

        $('.card').each(function() {
            $(this).click(function(){
                if ($(this).attr('id') == 'ajoutPat') {
                    window.location.assign('addPatient.jsp');
                } else {
                    //alert("Hauteur : " + this.clientHeight + " Largeur : " + this.clientWidth);
                    var haut =($(window).height()/2)-($('#info_3').height()/2);
                    var gauche = ($(window).width()/2)-($('#info_3').width()/2);
                    console.log('hauteur de la page : ' + $(window).height() + 'Largeur de la page : ' + $(window).width());
                    console.log('hauteur de la page : ' + $('#info_3').height() + 'Largeur de la page : ' + $('#info_3').width());
                    console.log('hauteur : ' + haut + ' gauche : ' + gauche);

                    // Style de l'arrière plan lors du clic sur une card
                    var styleCSS = {'z-index' : '10' ,'position':'fixed', 'background-color' : 'grey', 'opacity' : '0.65', 'left' : '0px', 'top' : '0px', 'bottom' : '0px', 'right' : '0px'};

                    // Style à appliquer aux informations appartenant au patient
                    var styleCSS2 = {'z-index' : '15', 'position' : 'fixed', 'top' : haut +'px', 'left' : gauche +'px', 'width' : '70%'};

                    // Affiche un plan transparent à 65%
                    $(this).children('.back-info').toggle();
                    $(this).children('.back-info').children('.info').toggle();
                    $(this).children('.back-info').children('.info').css(styleCSS);
                    // Affiche les info pour le patient sélectionné
                    $('#info_3').toggle();
                    $('#info_3').css(styleCSS2);
                }
            });
        });

        var autocomplete = function(input) {
            $.ajax({
                url:'SearchPatient',
                data : {nom : input},
                method: 'GET',
                success: function(data) {
                    console.log(data)
                    var id = 0;
                    // datatable for the autocomplete
                    var tab = '{';

                    for (id; id < data.length; id++) {
                        if (id>0) {
                            tab += ',';
                        }
                        tab +="\""+ data[i].name +"\": null";

                        // Changes the cards
                        var card = '<div class="col s12 m3">' +
                                        '<div id="pat-' + id + '" class="card">' +
                                            '<div class="card-image">' +
                                                '<img src="images/sample-1.jpg" height="100">' +
                                                '<span class="card-title">Card Title</span>' +
                                                '<a class="btn-floating halfway-fab waves-effect waves-light red">' +
                                                    '<i class="material-icons">add</i>' +
                                                '</a>' +
                                            '</div>' +
                                            '<div class="card-content">' +
                                                '<p>' + data[i].name + '</p>' +
                                            '</div>' +
                                            '<div class="back-info">' +
                                                    '<div class="info">' +
                                                        '<p>Informations sur le patient</p>' +
                                                    '</div>' +
                                                '</div>' +
                                        '</div>' +
                                    '</div>';





                    }

                    $('input.autocomplete').autocomplete({
                            data: tab,
                            limit: 10, // The max amount of results that can be shown at once. Default: Infinity.

                            minLength: 0 // The minimum length of the input for the autocomplete to start. Default: 1.
                        });
                }, dataType:'json'
            });

        };

        // Define the content of the autocomplete dynamicaly
        $("#autocomplete-input").on('input',function(){
            // Show the corresponding patient to pattern given
            autocomplete($("#autocomplete-input").val());
            // Display the result on the cards

        });

});
