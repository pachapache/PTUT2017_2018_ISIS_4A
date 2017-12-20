<%@include file="tete.jsp" %>

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
            <div class="row" id="place">

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
                    </div>
                </div>
            </div>

            

        </div>
        <br>
        <br>
    </div>

            <!-- Info sur les patients -->
            <div class="row">
                    <div id="info_3" class="info" style="visibility: hidden; display: none;">
                        <ul class="collapsible" data-collapsible="accordion">
                            <li style="background-color: white;">
                                <div class="collapsible-header"><i class="material-icons">filter_drama</i>First</div>
                                <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                            </li>
                            <li style="background-color: white;">
                                <div class="collapsible-header"><i class="material-icons">place</i>Second</div>
                                <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                            </li>
                            <li style="background-color: white;">
                                <div class="collapsible-header"><i class="material-icons">whatshot</i>Third</div>
                                <div class="collapsible-body"><span>Lorem ipsum dolor sit amet.</span></div>
                            </li>
                            </ul>
                    </div>
                </div>



<%@include file="pied.jsp" %>
    <script type="text/javascript" src="searchPatient.js"></script>

</body>

</html>