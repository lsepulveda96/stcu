app.controller('controladorParada', ['$scope','ngDialog','servicioParada', function($scope, ngDialog, servicio) {

  var coorLat = 0.0;
  var coorLng = 0.0;

  // console.log("coorLat : " + coorLat + " - coorLng : " + coorLng);

  $scope.save = function(){
    console.log("Parada guardada con exito");
    // console.log("coorLat : " + coorLat + " - coorLng : " + coorLng);

    servicio.save(coorLat , coorLng , direccion, function(error, data){
      // alert("Parada guardada con exito");

      if(error){
        console.log(error);
        return;
      }else {
        $scope.tipomsj="EXITO!";
        $scope.mensaje = "Los cambios se guardaron correctamente";
        ngDialog.open({ template: 'pages/msjDialog.html',
                       className: 'ngdialog-theme-default',
                 closeByDocument: false,
                           scope: $scope });
      }
    });
  }

  var popup = L.popup();



 //  var marker; // esta tiene que ser global
 //  function onMapClick(e) {
 //
 //      marker = new L.Marker(e.latlng, {draggable:true});
 //      mymap.addLayer(marker);
 //
 //      console.log("latitud ctrl: " + e.latlng.lat);
 //      console.log("longitud ctrl: " + e.latlng.lng);
 //
 //       coorLat = e.latlng.lat;
 //       coorLng = e.latlng.lng;
 //    }
 //
 //
 // mymap.on('click', onMapClick);

 var marker = {}; // esta tiene que ser global
 var direccion;
 function onMapClick(e) {

     console.log("latitud ctrl: " + e.latlng.lat);
     console.log("longitud ctrl: " + e.latlng.lng);

      coorLat = e.latlng.lat;
      coorLng = e.latlng.lng; // Para luego guardarlas // deberan cambiar por Push en un array

      if (marker != undefined) {
            mymap.removeLayer(marker);
      };

      // marker = new L.Marker(e.latlng, {draggable:true});
      // mymap.addLayer(marker);

      var geocodeService = L.esri.Geocoding.geocodeService();

      geocodeService.reverse().latlng(e.latlng).run(function(error, result) {
         marker = new L.marker(result.latlng);
         mymap.addLayer(marker);
         // L.marker(result.latlng).addTo(mymap).bindPopup(result.address.Match_addr).openPopup();
         marker.bindPopup(result.address.Match_addr).openPopup();
         direccion = result.address.Match_addr;
         console.log("Direccion: " + direccion);
       });
   }

   //// Geocoding
   // var geocodeService = L.esri.Geocoding.geocodeService();
   //
   // map.on('click', function(e) {
   //   geocodeService.reverse().latlng(e.latlng).run(function(error, result) {
   //     L.marker(result.latlng).addTo(map).bindPopup(result.address.Match_addr).openPopup();
   //   });
   // });

   mymap.on('click', onMapClick);

   function obtenerParada() {
      servicio.obtenerParada(function(error, paradas) {
      if(error) {
        $scope.tipomsj="ERROR";
        $scope.mensaje = "No se a podido cargar la lista de paradas";
        // ngDialog.open({ template: 'pages/msjDialog.html',
        //                className: 'ngdialog-theme-default',
        //          closeByDocument: false,
        //                    scope: $scope });
        return;
      }
      $scope.paradas = paradas;

      for (var valor of paradas){
        L.marker([valor.latitud, valor.longitud]).addTo(mymap)
        // console.log(" latitud : " + valor.latitud + " longitud : " + valor.longitud);
         .bindPopup(valor.direccion);
      }

    });
  }

  $scope.deleteLast = function() {
    // console.log("Aca entra");
      mymap.removeLayer(marker);
  };

  obtenerParada();

    }]);
