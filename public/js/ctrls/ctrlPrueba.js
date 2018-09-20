app.controller("controladorPrueba", ["$scope","$location", "$routeParams", "servicioPrueba", function($scope,$location, $params, servicio) {

  function obtener() {
      servicio.obtener(function(error, json) {
      if(error) {
        $scope.tipomsj="ERROR";
        $scope.mensaje = "No se a podido cargar else json";
        // ngDialog.open({ template: 'pages/msjDialog.html',
        //                className: 'ngdialog-theme-default',
        //          closeByDocument: false,
        //                    scope: $scope });
        return;
      }
      $scope.json = json;
      console.log("Dato: " +json);
    });
  }

  obtener();


}]);
