app.service('servicioLinea', ['$http',function($http) {

    // this.obtenerTodasLineas = function(callback) {
    //   $http.get( 'rest/lineas').then(
    //     function(response) {
    //       return callback( false, response.data);
    //     },
    //     function(response) {
    //       return callback( response );
    //     });
    // }


    this.obtenerTodasLineas = function(callback) {
      $http.get( 'rest/lineas').then(
        function(response) {
          return callback( false, response.data);
        },
        function(response) {
          return callback( response );
        });
    }

    //////////////////////////////////////


    this.findAll = function(callback){
  		    $http.get("rest/lineas").then(
  			    function(result){
  				    callback(false,result.data);
  			    },
      			function(error){
      				callback(error);
      			});
  	    }

        this.find = function(id, callback){
  		    $http.get("rest/lineas/" + id).then(
  			    function(result){
  				    callback(false,result.data);
  			    },
      			function(error){
      				callback(error);
      			});
  	    }

        this.searchByPage = function(search, page, cant, callback){
                $http
                  .get('rest/lineas?page='+page+'&cant='+cant)
                  .then(
                    function(res){
                      return callback(false, res.data)
                    },
                    function(err){
                      return callback(err.data)
                    }
                  )
              },

        this.save = function(data, callback){
          $http.post("rest/lineas", data)
          .then(
  			    function(result){
  				    callback(false,result.data);
  			    },
      			function(error){
      				callback(error);
      			});
  	    }

        // this.update = function(id, nombre, descripcion, observaciones, callback){
        //
        //   console.log("Actualizando: "+id+" - "+nombre+" - "+descripcion+" - "+observaciones);
        //   $http({
        //     method:"PUT",
        //     url:"rest/lineas/"+id,
        //     params:{"nombre": nombre, "descripcion": descripcion, "observaciones": observaciones } })
        //   .then(
  			//     function(result){
  			// 	    callback(false,result.data);
  			//     },
      	// 		function(error){
      	// 			callback(error);
      	// 		});
  	    // }

        this.delete = function(id, callback){
          $http.delete("rest/lineas/" + id)
          .then(
  			    function(result){
  				    callback(false,result.data);
  			    },
      			function(error){
      				callback(error);
      			});
  	    }



  }]);
