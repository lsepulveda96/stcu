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

import model.Colectivo;
import stateless.ColectivoService;

import java.util.Collection;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Path("/colectivos")
public class ColectivoRestServlet {
  @EJB ColectivoService service;

  ObjectMapper mapper = new ObjectMapper();

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String findAllColectivos() throws IOException {
    Collection<Colectivo> colectivos = service.findAllColectivos();
    return mapper.writeValueAsString( colectivos );
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public String mostrarUbicacion() throws IOException {
    return "OK";
  }


}
