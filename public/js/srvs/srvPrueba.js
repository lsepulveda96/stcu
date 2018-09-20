app.service('servicioPrueba', ['$http',function($http) {

  this.obtener = function(callback) {
    $http.get( 'rest/pruebas').then(
      function(response) {
        return callback( false, response.data);
      },
      function(response) {
        return callback( response );
      });
  }

  // this.save = function(coorLat,coorLng,direccion, callback){
  //
  //   console.log("servicioPrueba : Datos guardados");
  //   $http({
  //     method:"PUT",
  //     url:"rest/pruebas/",
  //     params:{"nombre": nombre } })
  //   .then(
  //     function(result){
  //       callback(false,result.data);
  //     },
  //     function(error){
  //       callback(error);
  //     });
  // }

}]);
