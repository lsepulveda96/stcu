package servlet;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import model.Parada;
// import stateless.PruebaService;
import java.util.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
// import stateless.Page;
import stateless.utilities.Coordenada;




import java.util.Calendar;
import java.util.Collection;
import javax.persistence.EntityManager;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.*;
import java.util.Map;
import java.lang.reflect.Method;
import javax.persistence.TemporalType;
import java.util.Map;
import javax.resource.NotSupportedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Path("/pruebas")
public class PruebaRestServlet {

  // inject a reference to the ParadaService slsb
  // @EJB PruebaService service;

  //mapea lista de pojo a JSON
  ObjectMapper mapper = new ObjectMapper();



  // @GET
  // @Produces(MediaType.APPLICATION_JSON)
  // public String findParada() throws IOException {
  //   // List<Coordenada> lista = service.findParada();
  //   // List<Coordenada> lista = service.findParada();
  //   return mapper.writeValueAsString(lista);
  // }
  //
  // @POST
  // @Path("/massive")
  // @Produces(MediaType.APPLICATION_JSON)
  // public String createMassive(String json) throws IOException {
  //
  //   List<Parada> Paradas = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class,Parada.class));
  //   for(Parada Parada:Paradas){
  //     Parada = service.createParada(Parada);
  //   }
  //   return mapper.writeValueAsString(Paradas);
  // }


  // para implementar

  static String consulta = "null";

  @POST
  @Path("/post")
  @Produces(MediaType.APPLICATION_JSON)
  public String consultaPost(String json) throws RollbackException, NotSupportedException, IOException {
    consulta = json;
    // Parada parada = service.createParada(newPunto, newDireccion);
    return mapper.writeValueAsString(consulta);
  }

  // o en statless

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String consultaGet() throws IOException {
    // List<Coordenada> lista = service.findParada();
    return mapper.writeValueAsString(consulta);
  }

}
