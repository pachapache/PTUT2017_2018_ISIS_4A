function readDataBase(){

}



$(document).ready(function () {

     var test = "lol";
 $.ajax({
                url:'SearchDisease',
                data : {nom : "tot"},
                method: 'GET',
                success: function(data) {
                    console.log(data);
                },
                dataType:'json'
            });

  $('.disease').autocomplete({
   data: {
     "Apple": null,
     "Microsoft": null,
     "Google": null,
     "gfds": null,
     "gbfds": null,
     "Gonhbgfdsogle": null,
     "Apgbdsple": null,
     "Mibgfdccrosoft": null,
     "Goobdsgle": null
   },
   limit: 3,
   onAutocomplete: function(val) {
     console.log(val)
   },
   minLength: 0,
 });

// $('#pagination').pagination({
//    align: 'left',
//    lastPage:  10,
//    firstPage:  1,
//    urlParameter: 'page',
//    useUrlParameter: true,
//    onClickCallback: function(requestedPage){
//        console.log('Requested page is '+ requestedPage);
//    }
//});

});
