<%-- 
    Document   : login.jsp
    Created on : 23 janv. 2018, 14:45:05
    Author     : lexr
--%>

<%@include file="tete.jsp" %>

<div class="row">
    <div class="container">
        <h2 class="center"> Login </h2>
        <div class="col s12 m6 offset-m3">
            <div class="card brown lighten-3" >
                <div class="card-content white-text" >
                    <span class="card-title center">Account</span>
                </div>
                <div class="card-action">

                    <div class="row">
                        <div class="input-field col l12 m12 s12">
                            <i class="material-icons prefix white-text">account_circle</i>
                            <input id="icon_prefix" type="text" class="white-text" class="validate">
                            <label for="icon_prefix" class="white-text" >Login</label>
                        </div>
                        <div class="input-field col l12 m12 s12">
                            <i class="material-icons prefix white-text">phone</i>
                            <input id="icon_telephone" class="white-text" type="tel" class="validate">
                            <label for="icon_telephone" class="white-text" >Password</label>
                        </div>

                        <div class="row">
                            <a href="index.jsp" class="col l4 offset-l4 btn-large waves-effect waves-light btn orange">Submit</a>
                        </div>

                    </div>

                </div>
            </div>
        </div>


    </div>
</div>

<%@include file="pied.jsp" %>
<script>


    $(document).ready(function () {
        $('.collapsible').collapsible();
    });

    $(document).ready(function () {
        $('select').material_select();
    });
</script>
</body>
</html>
