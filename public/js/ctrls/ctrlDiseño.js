app.controller("controladorDiseño", ["$scope","$location", "$routeParams", "servicioDiseño", function($scope,$location, $params, servicio) {

  $scope.save = function(){
    console.log("Reaccion a Send");
  }
}]);
