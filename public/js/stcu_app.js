var app = angular.module('stcu_app', ['ngRoute','ngDialog']);

app.config(['$routeProvider', function(routeprovider) {
  routeprovider
  .when('/', {
    templateUrl: "pages/inicio.html"
  })
  .when( '/colectivos', {
    templateUrl: "pages/colectivosPage.html",
    controller: "controladorColectivo"
  })
  .when( '/mapa', {
    templateUrl: "pages/mapa.html",
    controller: "controladorMapa"
  })
  .when( '/parada', {
    templateUrl: "pages/paradaPage.html",
    controller: "controladorParada"
  })

  .when('/linea',{
		templateUrl:'pages/lineasPage.html',
		controller: 'controladorLineas'
	})
	.when('/linea/:action',{
		templateUrl:'pages/lineasForm.html',
		controller: 'controladorLinea'
	})
	.when('/linea/:action/:id',{
		templateUrl:'pages/lineasForm.html',
		controller: 'controladorLinea'
	})
  .when('/prueba',{
		templateUrl:'pages/prueba.html',
		controller: 'controladorPrueba'
	})
  .when('/paradas',{
		templateUrl:'pages/paradaList.html',
		controller: 'controladorParadas'
	})
  .when('/diseño',{
    templateUrl:'pages/diseño.html',
    controller: 'controladorDiseño'
  })

}
]);
