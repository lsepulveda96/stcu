app.controller('controladorColectivo', ['$scope','ngDialog','servicioColectivo', function($scope, ngDialog, servicio) {

    function obtenerColectivos() {
        servicio.obtenerTodosColectivos(function(error, colectivos) {
        if(error) {
          $scope.tipomsj="ERROR";
          $scope.mensaje = "No se a podido cargar la lista de colectivos";
          ngDialog.open({ template: 'pages/msjDialog.html',
                         className: 'ngdialog-theme-default',
                   closeByDocument: false,
                             scope: $scope });
          return;
        }
        $scope.colectivos = colectivos;
      });
    }

    obtenerColectivos();
  }]);
