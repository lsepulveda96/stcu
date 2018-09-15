app.service('servicioParada', ['$http',function($http) {

    this.obtenerParada = function(callback) {
      $http.get( 'rest/paradas').then(
        function(response) {
          return callback( false, response.data);
        },
        function(response) {
          return callback( response );
        });
    }

    this.obtenerTodasParadas = function(callback) {
      $http.get('rest/allParadas').then(
        function(response) {
          return callback( false, response.data);
        },
        function(response) {
          return callback( response );
        });
    }

    // this.save = function(coorLat,coorLng, callback){
    //   $http.post("rest/paradas", data)
    //   .then(
    //     function(result){
    //       callback(false,result.data);
    //     },
    //     function(error){
    //       callback(error);
    //     });
    // }

    this.save = function(coorLat,coorLng,direccion, callback){

      console.log("servicioParada : Datos guardados");
      $http({
        method:"PUT",
        url:"rest/paradas/",
        params:{"coorLat": coorLat, "coorLng": coorLng, "direccion": direccion } })
      .then(
        function(result){
    	    callback(false,result.data);
        },
    		function(error){
    			callback(error);
    		});
    }

  }]);
