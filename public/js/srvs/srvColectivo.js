app.service('servicioColectivo', ['$http',function($http) {

    this.obtenerTodosColectivos = function(callback) {
      $http.get( 'rest/colectivos').then(
        function(response) {
          return callback( false, response.data);
        },
        function(response) {
          return callback( response );
        });
    }

  }]);
