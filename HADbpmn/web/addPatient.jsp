<%@include file="tete.jsp" %>

  <div class="section no-pad-bot" id="index-banner">
    <div class="container">
      <br><br>
      <h1 class="header center orange-text">Ajouter un patient</h1>
      <div class="row center">
        <h5 class="header col s12 light">Lahus sur l'importance de saisir des informations exactes</h5>
      </div>

      <br><br>

    </div>
  </div>



  <div class="row">
    <div class="container">
      <form class="col s12">
        <div class="row">
          <ul class="collapsible" data-collapsible="accordion">

            <!-- Données personnelles -->
            <li>
              <div class="collapsible-header"><i class="material-icons">account_circle</i>Données personnelles</div>
              <div class="collapsible-body">
                <div class="row">
                  <div class="input-field col s4">
                    <input type="text" class="validate" required="true">
                    <label>Nom</label>
                  </div>

                  <div class="input-field col s4">
                    <input type="text" class="validate" required="true">
                    <label>Prénom</label>
                  </div>

                  <div class="input-field col s4">
                    <select>
                      <option value="" disabled selected>Sexe</option>
                      <option value="1">Homme</option>
                      <option value="2">Femme</option>
                      <option value="3">Autre</option>
                    </select>
                  </div>

                  <div class="input-field col s3">
                    <i class="material-icons prefix">today</i>
                    <input type="text" class="datepicker" required="true">
                    <label>Date de naissance</label>
                  </div>

                  <div class="input-field col s1">
                    <label>à</label>
                  </div>

                  <div class="input-field col s8">
                    <input type="text" class="validate" required="true">
                    <label>Lieu de naissance</label>
                  </div>

                  <div class="input-field col s4">
                    <i class="material-icons prefix">add_circle</i>
                    <input type="text" class="validate" required="true">
                    <label>Numéro de sécurité sociale</label>
                  </div>

                  <div class="input-field col s8">
                    <i class="material-icons prefix">location_on</i>
                    <input type="text" class="validate" required="true">
                    <label>Adresse</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">phone</i>
                    <input type="tel" class="validate">
                    <label>Telephone</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">email</i>
                    <input type="email" class="validate">
                    <label>Email</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">add_circle</i>
                    <select>
                      <option value="" disabled selected>Situation marietale</option>
                      <option value="1">Célibataire</option>
                      <option value="2">Marié(e)</option>
                      <option value="3">En concubinage</option>
                      <option value="4">Divorcé(e)</option>
                      <option value="5">Séparé(e)</option>
                      <option value="6">Veuf(veuve)</option>
                    </select>
                  </div>

                  <div class="col s6">
                    <i class="material-icons prefix">wifi</i>
                    Avez vous un accès à internet ?
                    <div class="switch" style="display: inline-block">
                      <label>
                        Non
                        <input type="checkbox">
                        <span class="lever"></span>
                        Oui
                      </label>
                    </div>
                  </div>
                </div>
              </div>
            </li>

            <!-- Données médicales -->
            <li>
              <div class="collapsible-header"><i class="material-icons">assignment</i>Données médicales</div>
              <div class="collapsible-body">
                <div class="row">

                  <div class="input-field col s6">
                    <i class="material-icons prefix">accessibility</i>
                    <input type="text" class="validate">
                    <label>Taille</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">linear_scale</i>
                    <input type="text" class="validate">
                    <label>Poids</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">add_circle</i>
                    <input type="text" class="validate">
                    <label>Allergies</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">add_circle</i>
                    <select multiple>
                      <option value="" disabled selected>Pathologies</option>
                      <option value="1">Diabète</option>
                      <option value="2">Anemie</option>
                      <option value="3">Parkinson</option>
                    </select>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">add_circle</i>
                    <input type="text" class="validate">
                    <label>Allergies</label>
                  </div>

                  <div class="input-field col s6">
                    <i class="material-icons prefix">add_circle</i>
                    <input type="text" class="validate">
                    <label>Antécédents</label>
                  </div>

                  <div class="col s12">
                    <i class="material-icons prefix">wifi</i>
                    Présence d'une personne valide dans l'entourage ?
                    <div class="switch" style="display: inline-block">
                      <label>
                        Non
                        <input type="checkbox">
                        <span class="lever"></span>
                        Oui
                      </label>
                    </div>
                  </div>

                  <div class="col s12">
                    <i class="material-icons prefix">wifi</i>
                    Lieu de vie accessible ?
                    <div class="switch" style="display: inline-block">
                      <label>
                        Non
                        <input type="checkbox">
                        <span class="lever"></span>
                        Oui
                      </label>
                    </div>
                  </div>
                </div>
              </div>
            </li>

            <li>
              <div class="collapsible-header"><i class="material-icons">create</i>Notes patient</div>
              <div class="collapsible-body">
                <div class="row">
                  <div class="input-field col s12">
                    <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
                    <label>Informations diverses sur le patient</label>
                  </div>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </form>
      <div class="input-field col s12">
        <button class="btn waves-effect waves-light" type="submit" name="action">Ajouter le patient
          <i class="material-icons right">send</i>
        </button>
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
