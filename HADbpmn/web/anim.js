$(document).ready(function(){
  

        var cards = document.getElementsByClassName("card");

        var i = 0;

        $('.card').each(function() {
            $(this).click(function(){
                if ($(this).attr('id') == 'ajoutPat') {
                    window.location.assign('addPatient.html');
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

});