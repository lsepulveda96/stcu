app.controller("controladorLinea", ["$scope","$location", "$routeParams", "servicioLinea", function($scope,$location, $params, servicio) {

  if(['new','edit','view'].indexOf($params.action) == -1){
    alert("Acción inválida: " + $params.action);
    $location.path("/linea");
  }

  function find(id){
    servicio.find(id, function(error, data){
      if(error){
        console.log(error);
        return;
      }
      $scope.data = data;
    });
  }

  $scope.save = function(){
    servicio.save($scope.data, function(error, data){
      if(error){
        console.log(error);
        return;
      } else {
          $scope.tipomsj="EXITO!";
          $scope.mensaje = "Los cambios se guardaron correctamente";
          ngDialog.open({ template: 'pages/msjDialog.html',
                         className: 'ngdialog-theme-default',
                   closeByDocument: false,
                             scope: $scope });
        }
      $scope.data = data;
      $location.path("/linea")
    });
  }

  // $scope.update = function(){
  // 	servicio.update(
  //     $scope.data.id,
  //     $scope.data.nombre,
  //     $scope.data.descripcion,
  //     $scope.data.observaciones,
  //     function(error, data){
  // 		if(error){
  //       console.log(error);
  // 			return;
  // 		}
  // 		$scope.data = data;
  //     $location.path("/linea")
  // 	});
  // }

  $scope.cancel = function(){
    $location.path("/linea");
  }

  $scope.action = $params.action;

  if ($scope.action == 'edit' || $scope.action == 'view') {
    find($params.id);
  }


    }]);
