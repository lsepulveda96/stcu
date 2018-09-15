app.controller('controladorLineas', ['$scope','ngDialog','servicioLinea', function($scope, ngDialog, servicio) {

  // $scope.service = servicio;
  // $scope.listElement = [];
  // $scope.cantPerPage = 10;

  $scope.delete = function(id){

    console.log("Deleting: " + id)

    servicio.delete(id, function(error, data){
      if(error){
        console.log(error);
        return;
      }
      $location.path("/linea");
      $route.reload()
    });
  }

    /////////////////////////////////////77
    function obtenerLineas() {
        servicio.obtenerTodasLineas(function(error, lineas) {
        if(error) {
          $scope.tipomsj="ERROR";
          $scope.mensaje = "No se a podido cargar la lista de lineas";
          ngDialog.open({ template: 'pages/msjDialog.html',
                         className: 'ngdialog-theme-default',
                   closeByDocument: false,
                             scope: $scope });
          return;
        }
        $scope.lineas = lineas;
      });
    }

    obtenerLineas(); // lo manda a llamar para que aparezcan en pantalla

    }]);
