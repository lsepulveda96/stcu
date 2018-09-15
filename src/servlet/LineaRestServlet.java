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
import model.Linea;
import stateless.LineaService;
import java.util.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

@Path("/lineas")
public class LineaRestServlet {

  // inject a reference to the LineaService slsb
  @EJB LineaService service;

  //mapea lista de pojo a JSON
  ObjectMapper mapper = new ObjectMapper();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String findAllLineas() throws IOException {
    Collection<Linea> lineas = service.findAllLineas();
    return mapper.writeValueAsString( lineas );
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String createLinea(String json) throws IOException {
    Linea linea = mapper.readValue(json, Linea.class);
    linea = service.createLinea(linea);
    return mapper.writeValueAsString(linea);
  }
}
