  <%@include file="tete.jsp" %>

  <div class="row">
    <div class="container">
          <div class="col s12 m6">
            <div class="card brown lighten-3" style="border: 1px solid #ff9800;">
              <div class="card-content white-text" style="border-color:#ff9800; border-width: 0px 0px 1px 0px; border-style: solid;">
                <span class="card-title">Patient </span>
              </div>
              <div class="card-action">
                  
                <div class="row">
                  <div class="col l3"></div>
                  <a class="col l6 btn-large waves-effect waves-light btn orange"><i class="material-icons left">add</i>Ajouter</a>
                  <div class="col l3"></div>
                </div>
                <div class="row">
                  <div class="col l3"></div>
                  <a class="col l6 btn-large waves-effect waves-light btn orange"><i class="material-icons left">search</i>Chercher</a>
                  <div class="col l3"></div>
                </div>
                
              </div>
            </div>
          </div>
          <div class="col s12 m6">
            <div class="card blue-grey darken-1">
              <div class="card-content white-text">
                <span class="card-title">Pathologie</span>
              </div>
              <div class="card-action">

                <div class="row">
                  <div class="col l3"></div>
                  <a class="col l6 btn-large waves-effect waves-light btn orange"><i class="material-icons left">add</i>Ajouter</a>
                  <div class="col l3"></div>
                </div>
                <div class="row">
                  <div class="col l3"></div>
                  <a class="col l6 btn-large waves-effect waves-light btn orange"><i class="material-icons left">search</i>Chercher</a>
                  <div class="col l3"></div>
                </div>
                
              </div>
            </div>
          </div>
        </div>
        </div>

  <%@include file="pied.jsp" %>    
  <script>
  $('.datepicker').pickadate({
    format: 'dd/mm/yyyy',
    date: 'dd/mm/yyyy',
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 120, // Creates a dropdown of 15 years to control year,
    today: 'Aujourd\'hui',
    clear: 'Effacer',
    close: 'Valider',
    closeOnSelect: false, // Close upon selecting a date,
    monthsFull: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
    monthsShort: ['Jan', 'Fév', 'Mars', 'Avr', 'Mai', 'Juin', 'Juil', 'Août', 'Sept', 'Octobre', 'Novembre', 'Décembre'],
    weekdaysShort: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'],
    weekdaysFull: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'],
  });

  $(document).ready(function(){
    $('.collapsible').collapsible();
  });

  $(document).ready(function() {
    $('select').material_select();
  });
  </script>
</body>
</html>
