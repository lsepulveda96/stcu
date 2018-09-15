import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;

import model.Parada;
import stateless.utilities.Coordenada;

import stateless.ParadaService;
import stateless.ParadaServiceBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.NoResultException;
import eu.bitm.NominatimReverseGeocoding.*;
// NominatimReverseGeocodingJAPI


public class ParadaTest {

  public static ParadaService serviceParada;

  protected static EntityManager em;
  protected static EntityManagerFactory emf;


  @BeforeClass
  public static void preTest(){
    emf = Persistence.createEntityManagerFactory("stcu");
    em = emf.createEntityManager();

    serviceParada = new ParadaServiceBean();

    serviceParada.setEntityManager(em);

  }

  @Test
  public void ParadasTest() {

  Collection<Coordenada> lista = new ArrayList<Coordenada>();

  lista = serviceParada.findParada();

  for(Coordenada item: lista){
    System.out.println(" Latlng : " + item.getLatitud() + " <--> " + item.getLongitud());
  }
  //   em.getTransaction().begin();
  //
  //   String punto= "-42.234079 -65.94324";
  //
  //   Parada parada = new Parada();
  //
  //   parada.setObservacion("San Martin 2422");
  //   em.persist( parada );
  //
  //   em.getTransaction().commit();
  //
  //   em.getTransaction().begin();
  //
  //   try{
  //     Query q = em.createNativeQuery( "UPDATE Parada "
  //                                 + "SET PUNTO = (ST_GeomFromText('POINT(" + punto + ")',4326)) "
  //                                 + " WHERE CODIGO = ? ;");
  //   q.setParameter( 1, parada.getCodigo() );
  //   q.executeUpdate();
  // }catch(javax.persistence.NoResultException ex) { }


  ///////////////////////////////////////////////////////////////////////////////////////

  // Query query = getEntityManager().createQuery("SELECT e FROM LogValidacion e WHERE e.parteMO.operario.id = :newOperarioId AND e.parteMO.fecha = :newFecha AND e.bandera = FALSE"); //
  //   query.setParameter("newOperarioId",newOperarioId);
  //   query.setParameter("newFecha",newFecha);
  //
  //   return (Collection<LogValidacion>) query.getResultList();


  // Query q = em.createNativeQuery("SELECT (ST_AsText(punto)) FROM Parada WHERE CODIGO = ?; ");
  // q.setParameter( 1, 1 );
  // String resultado = (String) q.getSingleResult();
  // System.out.print(" El resultado es: " + resultado);
  // System.out.print(" ********************************************************************************** ");

  // ST_Y(punto)

  // Coordenada coordenada;





  // Query q = em.createNativeQuery("SELECT (ST_X(punto)), (ST_Y(punto)) FROM Parada");
  // //  WHERE CODIGO = ?
  // // q.setParameter( 1, 1 );
  // List<Object[]> coor = (List<Object[]>) q.getResultList();
  //
  // List<Coordenada> lista = new ArrayList<Coordenada>();
  //
  // for(Object[] item: coor){
  //   lista.add(new Coordenada(item));
  // }
  //
  // System.out.println("**********************************************************");
  //
  // for(Coordenada coordenada : lista)
  //   System.out.println(" Latitud: " + coordenada.getLatitud() + " Longitud: " + coordenada.getLongitud());

  //
  //   em.getTransaction().commit();

// NominatimReverseGeocodingJAPI nominatim1 = new NominatimReverseGeocodingJAPI(); //create instance with default zoom level (18)

// NominatimReverseGeocodingJAPI nominatim2 = new NominatimReverseGeocodingJAPI(12); //create instance with given zoom level

// try{
// System.out.println("********************************************");
// System.out.println(nominatim1.getAdress(-43.321223, -65.312312)); //returns Address object for the given position
// System.out.println("********************************************");
// }catch(java.lang.NoClassDefFoundError e){ }
// e.getMessage

 }


  @AfterClass
  public static void postTest() {
    // Cierra las conexiones
    em.close();
    emf.close();
  }
}
