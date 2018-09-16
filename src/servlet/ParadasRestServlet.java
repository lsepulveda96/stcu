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
import stateless.ParadaService;
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

@Path("/allParadas")
public class ParadasRestServlet {

  // inject a reference to the ParadaService slsb
  @EJB ParadaService service;
  // @EJB PruebaService service2;

  //mapea lista de pojo a JSON
  ObjectMapper mapper = new ObjectMapper();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String findAllParadas() throws IOException {
    List<Parada> paradas = service.findAllParadas();
    return mapper.writeValueAsString(paradas);
  }

  // @GET
  // @Produces(MediaType.APPLICATION_JSON)
  // public String findParada() throws IOException {
  //   // List<Coordenada> lista = service.findParada();
  //   List<Coordenada> lista = service.findParada();
  //   return mapper.writeValueAsString(lista);
  // }
  //
  // @PUT
  // @Produces(MediaType.APPLICATION_JSON)
  // public String createParada(@QueryParam("coorLat") String newCoorLat, @QueryParam("coorLng") String newCoorLng) throws RollbackException, NotSupportedException, IOException {
  //
  //   String newPunto = newCoorLat + " " + newCoorLng;
  //
  //   Parada parada = service.createParada(newPunto);
  //   return mapper.writeValueAsString(parada);
  // }
  //
  // // @DELETE
  // // @Path("/{id}")
  // // @Produces(MediaType.APPLICATION_JSON)
  // // public String removeParada(@PathParam("id") int id) throws IOException {
  // //   Parada est = service.removeParada(id);
  // //   return mapper.writeValueAsString(est);
  // // }
  //
  // // @PUT
  // // @Path("/{id}")
  // // @Produces(MediaType.APPLICATION_JSON)
  // // public String changeParada(@PathParam("id") int id, @QueryParam("nombre") String newNombre, @QueryParam("descripcion") String newDescripcion, @QueryParam("observaciones") String newObservaciones) throws IOException {
  // //   Parada est = service.changeParada(id,newNombre,newDescripcion,newObservaciones);
  // //   return mapper.writeValueAsString(est);
  // // }
}
