<%@include file="tete.jsp" %>


    <!-- Beginning of the web site's content -->
    <div class="container">
        <div class="section">

            <div class="row">
                <h1 class="header center blue-text">Fill intervention for a disease</h1>
                <div class="center">
                    <div class="input-field col s12">
                      <div class="input-field col s4">
                        <input type="text" class="validate" required="true">
                        <label>Name of disease</label>
                      </div>
                    </div>
                </div>
            </div>

            <div class="row">
              <div class="input-field col l3 m3 s12">
                  <select>
                      <option value="" disabled selected>Actor</option>
                      <option value="CareGiver">CareGiver</option>
                      <optgroup label="HomeCareProfessional">
                          <option value="Administrative">Administrative</option>
                          <option value="CareGiverProfessional">CareGiverProfessional</option>
                          <option value="MedicalProfessional">MedicalProfessional</option>
                          <option value="ParamedicsProfessional">ParamedicsProfessional</option>
                          <option value="PharmacyProfessional">PharmacyProfessional</option>
                          <option value="PsychoSocialProfessional">PsychoSocialProfessional</option>
                      </optgroup>
                      <option value="Patient">Patient</option>
                  </select>
              </div>

                    <div class="input-field col s4">
                        <select>
                            <option value="" disabled selected>Type of action</option>
                            <option value="BackOfficeActivity">BackOfficeActivity</option>
                            <option value="CaseManagementActivity">CaseManagementActivity</option>
                            <option value="EvaluationActivity">EvaluationActivity</option>
                            <option value="HouseworkActivity">HouseworkActivity</option>
                            <option value="MedicalActivity">MedicalActivity</option>
                            <option value="PatientActivity">PatientActivity</option>
                            <option value="PhysiotherapyActivity">PhysiotherapyActivity</option>
                            <option value="RehabilitativeActivity">RehabilitativeActivity</option>
                            <option value="SocialActivity">SocialActivity</option>
                        </select>
                    </div>

                    <div class="input-field col l2 m2 s12">
                        <select>
                            <option value="" disabled selected>Action</option>
                            <option value="1">ChangeSheets</option>
                            <option value="2">Eat</option>
                        </select>
                        <label>Action</label>
                    </div>



                    <div class="input-field col l2 m2 s12">
                        <select>
                            <option value="" disabled selected>HomeCareStructure</option>
                            <option value="1">At Home</option>
                            <option value="2">HomeCare</option>
                            <option value="3">Laboratory</option>
                        </select>
                        <label>HomeCareStructure</label>
                    </div>

                    <div class="input-field col l1 m1 s6">
                        <input id="freq" type="text" class="validate">
                        <label for="freq">Nb</label>
                    </div>

                    <div class="input-field col l1 m1 s6">
                        <select>
                            <option value="1">Day</option>
                            <option value="2">Week</option>
                            <option value="3">Month</option>
                        </select>
                        <label>Frequency</label>
                    </div>

                    <div class="col l1 m1 s12">
                        <a class="btn-floating btn-large waves-effect waves-light red" id="plus">
                            <i class="material-icons">add</i>
                        </a>
                    </div>

                </div>





                <div class="row">
                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l3 m3 s12">
                    </div>

                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l2 m2 s12">
                        <select multiple>
                            <option value="1">Morning</option>
                            <option value="2">Afternoon</option>
                            <option value="3">Evening</option>
                            <option value="4">Night</option>
                        </select>
                        <label>Frequency</label>
                    </div>
                    <div class="input-field col l1 m1 s12">
                        </div>
                </div>


                <div class="row">
                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l3 m3 s12">
                    </div>

                    <div class="input-field col l2 m2 s12">
                    </div>

                    <div class="input-field col l1 m1 s6">
                        <input id="freq" type="text" class="validate">
                        <label for="freq">Nb</label>
                    </div>

                    <div class="input-field col l1 m1 s6">
                        <select>
                            <option value="" disabled selected>Duration</option>
                            <option value="1">Day</option>
                            <option value="2">Week</option>
                            <option value="3">Month</option>
                            <option value="4">Year</option>
                        </select>
                        <label>Duration</label>
                    </div>

                    <div class="input-field col l1 m1 s12">
                        </div>

                </div>

        </div>
        <!-- End Of Section -->


    </div>
    <!-- End of Container -->
    <br>
    <br>
    </div>

    <%@include file="pied.jsp" %>

    <script>
        $(document).ready(function () {
            $('select').material_select();

            var ligne = '<tr><td><div class="input-field col l3 m3 s12 123 123"><select><option value="" disabled selected>Type d\'intervention</option><option value="1">Option 1</option><option value="2">Option 2</option></select><label>Type d\'intervention</label></div></td><td><div class="input-field col l3 m3 s12 123 123"><select><option value="" disabled selected>Action</option><option value="1">ChangeSheets</option><option value="2">Eat</option></select><label>Action</label></div></td><td><div class="input-field col l3 m3 s12 123 123"><select><option value="" disabled selected>Type d\'intervenant</option><option value="1">CareGiver</option><optgroup label="HomeCareProfessional"><option value="1">Administrative</option><option value="2">CareGiverProfessional</option><option value="3">MedicalProfessional</option><option value="4">ParamedicsProfessional</option></optgroup><option value="3">Patient</option></select><label>Type d\'intervenant</label></div></td><td><div class="input-field col l3 m3 s12 m12 l12"><select><option value="" disabled selected>Lieu</option><option value="1">At Home</option><option value="2">HomeCare</option><option value="3">Laboratory</option></select><label>Lieu</label></div></div></td><td><a class="btn-floating btn-large waves-effect waves-light red" id="plus"><i id="plus" class="material-icons">add</i></a></td></tr>';

            $('#plus').click(function() {
                $(this).removeAttr('id');
                $('#table').append(ligne);
                $('select').material_select();
            });



        });
    </script>

</body>

</html>
