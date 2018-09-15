app.controller('controladorParadas', ['$scope','ngDialog','servicioParada', function($scope, ngDialog, servicio) {

  function obtenerTodasParadas() {
      servicio.obtenerTodasParadas(function(error, paradas) {
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
    });
  }

  obtenerTodasParadas();

    }]);
