<!DOCTYPE html>
<html>

<head>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="materialize-css/dist/css/materialize.min.css" media="screen,projection" />
    <link type="text/css" rel="stylesheet" href="theme.css" media="screen,projection" />
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>

<body>


    <nav class="light-blue lighten-1" role="navigation">
        <div class="nav-wrapper container">
            <a id="logo-container" href="#" class="brand-logo">#HADBPMN</a>
            <ul class="right hide-on-med-and-down">
                <!--<li><a href="#">Lien 1</a></li>-->
            </ul>

            <ul id="nav-mobile" class="side-nav">
                <li>
                    <a href="#">Navbar Link</a>
                </li>
            </ul>
            <a href="#" data-activates="nav-mobile" class="button-collapse">
                <i class="material-icons">menu</i>
            </a>
        </div>
    </nav>



    <!-- Beginning of the web site's content -->
    <div class="container">
        <div class="section">

            <!--   Icon Section   -->
            <div class="row">

                <div class="col l3 m3 s12"></div>

                <div class="col l6 m6 s12">
                    <div class="row">
                        <div class="input-field col s12">
                            <i class="material-icons prefix">textsms</i>
                            <input type="text" id="autocomplete-input" class="autocomplete">
                            <label for="autocomplete-input">Autocomplete</label>
                        </div>
                    </div>
                </div>

                <div class="col l3 m3 s12"></div>

            </div>

            <!-- Display cards -->
            <div class="row">

                <div class="col s12 m3">
                    <div id="ajoutPat" class="card">
                        <div class="card-image">
                            <img src="images/sample-1.jpg" height="100">
                            <span class="card-title">Card Title</span>
                            <a class="btn-floating halfway-fab waves-effect waves-light red">
                                <i class="material-icons">add</i>
                            </a>
                        </div>
                        <div class="card-content">
                            <p>Ajouter Patient</p>
                        </div>
                        <div class="back-info">
                                <div class="info">
                                    <p>Informations sur le patient</p>
                                </div>
                            </div>
                    </div>
                </div>

                <div class="col s12 m3">
                    <div class="card">
                        <div class="card-image">
                            <img src="images/sample-1.jpg" height="100">
                            <span class="card-title">Card Title</span>
                            <a class="btn-floating halfway-fab waves-effect waves-light red">
                                <i class="material-icons">add</i>
                            </a>
                        </div>
                        <div class="card-content">
                            <p>Julie Tournessol</p>
                        </div>
                        <div class="back-info">
                                <div class="info">
                                    <p>Informations sur le patient</p>
                                </div>
                            </div>
                    </div>
                </div>

                <div class="col s12 m3">
                    <div class="card">
                        <div class="card-image">
                            <img src="images/sample-1.jpg" height="100">
                            <span class="card-title">Card Title</span>
                            <a class="btn-floating halfway-fab waves-effect waves-light red">
                                <i class="material-icons">add</i>
                            </a>
                        </div>
                        <div class="card-content">
                            <p>Marc Plantade</p>
                        </div>
                        <div class="back-info">
                                <div class="info">
                                </div>
                        </div>
                    </div>
                </div>

                <div class="col s12 m3">
                    <div class="card">
                        <div class="card-image">
                            <img src="images/sample-1.jpg" height="100">
                            <span class="card-title">Card Title</span>
                            <a class="btn-floating halfway-fab waves-effect waves-light red">
                                <i class="material-icons">add</i>
                            </a>
                        </div>
                        <div class="card-content">
                            <p>Miguel Sanchez</p>
                        </div>
                        <div class="back-info">
                            <div class="info">
                                <p>Informations sur le patient</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
        <br>
        <br>
    </div>

<!-- Info sur les patients -->
<div class="row" >
    <div id="info_3" class="info">
        <ul class="collapsible" data-collapsible="accordion">
                <li>
                  <div class="collapsible-header"><i class="material-icons">filter_drama</i>First</div>
                  <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                </li>
                <li>
                  <div class="collapsible-header"><i class="material-icons">place</i>Second</div>
                  <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                </li>
                <li>
                  <div class="collapsible-header"><i class="material-icons">whatshot</i>Third</div>
                  <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                </li>
              </ul>
</div>
</div>




    <footer class="page-footer orange">
        <div class="container">
            <div class="row">
                <div class="col l6 s12">
                    <h5 class="white-text">Company Bio</h5>
                    <p class="grey-text text-lighten-4">We are a team of college students working on this project like it's our full time job. Any amount would
                        help support and continue development on this project and is greatly appreciated.</p>


                </div>
                <div class="col l3 s12">
                    <h5 class="white-text">Settings</h5>
                    <ul>
                        <li>
                            <a class="white-text" href="#!">Link 1</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 2</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 3</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 4</a>
                        </li>
                    </ul>
                </div>
                <div class="col l3 s12">
                    <h5 class="white-text">Connect</h5>
                    <ul>
                        <li>
                            <a class="white-text" href="#!">Link 1</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 2</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 3</a>
                        </li>
                        <li>
                            <a class="white-text" href="#!">Link 4</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                Made by
                <a class="orange-text text-lighten-3" href="http://materializecss.com">Materialize</a>
            </div>
        </div>
    </footer>


    <!--Import jQuery before materialize.js-->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="materialize-css/dist/js/materialize.min.js"></script>
    <script type="text/javascript" src="anim.js"></script>

</body>

</html>