<!DOCTYPE html>
<html>
<head>
  <!--Import Google Icon Font-->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="materialize-css/dist/css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>

<body>
  <!--Import jQuery before materialize.js-->


  <nav class="light-blue lighten-1" role="navigation">
    <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">#HADBPMN</a>
      <ul id="nav-mobile" class="side-nav">
        <li><a href="#">Navbar Link</a></li>
      </ul>
      <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
  </nav>
  <div class="section no-pad-bot" id="index-banner">
    <div class="container">
      <br><br>
      <h1 class="header center orange-text">Holla !</h1>
      <div class="row center">
        <h5 class="header col s12 light">Lahus sur l'objectif de cette application ?</h5>
      </div>

      <br><br>

    </div>
  </div>


  <div class="row">
    <div class="container">
          <div class="col s12 m6">
            <div class="card blue-grey darken-1">
              <div class="card-content white-text">
                <span class="card-title">Patient </span>
              </div>
              <div class="card-action">
                <div>
                <a class="btn-floating btn-large waves-effect waves-light orange"><i class="material-icons">add</i>
                  <a>Ajouter</a>
                </div>
                  <a class="btn-floating btn-large waves-effect waves-light orange"><i class="material-icons">search</i>
                    <a>Chercher</a>
              </div>
            </div>
          </div>
          <div class="col s12 m6">
            <div class="card blue-grey darken-1">
              <div class="card-content white-text">
                <span class="card-title">Pathologie</span>
              </div>
              <div class="card-action">
                <div>
                <a class="btn-floating btn-large waves-effect waves-light orange"><i class="material-icons">add</i>
                  <a>Ajouter</a>
                </div>
                  <a class="btn-floating btn-large waves-effect waves-light orange"><i class="material-icons">search</i>
                    <a>Chercher</a>
              </div>
            </div>
          </div>
        </div>
        </div>

  <footer class="page-footer orange">
    <div class="container">
      <div class="row">
        <div class="col l6 s12">
          <h5 class="white-text">Company Bio</h5>
          <p class="grey-text text-lighten-4">We are a team of college students working on this project like it's our full time job. Any amount would help support and continue development on this project and is greatly appreciated.</p>
        </div>
        <div class="col l3 s12">
          <h5 class="white-text">Settings</h5>
          <ul>
            <li><a class="white-text" href="#!">Link 1</a></li>
            <li><a class="white-text" href="#!">Link 2</a></li>
            <li><a class="white-text" href="#!">Link 3</a></li>
            <li><a class="white-text" href="#!">Link 4</a></li>
          </ul>
        </div>
        <div class="col l3 s12">
          <h5 class="white-text">Connect</h5>
          <ul>
            <li><a class="white-text" href="#!">Link 1</a></li>
            <li><a class="white-text" href="#!">Link 2</a></li>
            <li><a class="white-text" href="#!">Link 3</a></li>
            <li><a class="white-text" href="#!">Link 4</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <div class="container">
        Made by <a class="orange-text text-lighten-3" href="http://materializecss.com">Materialize</a>
      </div>
    </div>
  </footer>

  <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="materialize-css/dist/js/materialize.min.js"></script>
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
