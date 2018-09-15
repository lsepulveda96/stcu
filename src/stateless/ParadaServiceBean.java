package stateless;

import java.util.Collection;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Parada;
import java.util.Map;
import java.lang.reflect.Method;
import stateless.utilities.Coordenada;
import javax.persistence.NoResultException;

import javax.persistence.EntityTransaction;
import javax.transaction.UserTransaction;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.TransactionRequiredException;
import javax.resource.NotSupportedException;
import java.lang.reflect.InvocationTargetException;

import javax.transaction.RollbackException;

import javax.transaction.UserTransaction;
import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ParadaServiceBean implements ParadaService {

  @Resource
  UserTransaction userTransaction;

  // @PersistenceContext
  // EntityManager em;

  @PersistenceContext(unitName="stcu")
  protected EntityManager em;

  public void setEntityManager(EntityManager emLocal){
    em = emLocal;
  }

  public EntityManager getEntityManager() {
    return em;
  }

  // @EJB SrvParada service;

  // public Parada createParada(Parada est) {
  //   getEntityManager().persist(est);
  //   return est;
  // }

  // public Parada removeParada(int id) {
  //   Parada est = findParada(id);
  //   if (est != null) {
  //     getEntityManager().remove(est);
  //     return est;
  //   } else return null;
  // }

  public Parada createParada(String newPunto, String newDireccion) {

    // String punto= "-42.777724 -65.0295883";
    Parada parada = new Parada();
    // parada.setObservacion("Av. Roca 3000");
    parada.setObservacion(newDireccion);

  try{

    userTransaction.begin();

    getEntityManager().persist( parada );

    userTransaction.commit();

    }catch (TransactionRequiredException e){
    System.out.println("Hubo un error!!" + e.getMessage());
    }catch (Exception e) {}

    try
    {
    userTransaction.begin();

      Query q = getEntityManager().createNativeQuery( "UPDATE parada "
                                  + "SET coordenada = (ST_GeomFromText('POINT(" + newPunto + ")',4326)) "
                                  + " WHERE codigo = ? ;");
    q.setParameter( 1, parada.getCodigo() );
    q.executeUpdate();

    userTransaction.commit();

    }catch (TransactionRequiredException e){
      System.out.println("Hubo un error!!" + e.getMessage());
    }catch (Exception e) {}

    return parada;
  }



  public List<Coordenada> findParada() {

    // Coordenada coordenada = new Coordenada();
    // Query q = em.createNativeQuery("SELECT (ST_Y(punto)) FROM Parada WHERE CODIGO = ?; ");
    // q.setParameter( 1, 1 );
    // Double resultado = (Double) q.getSingleResult();
    //
    // Query q2 = em.createNativeQuery("SELECT (ST_X(punto)) FROM Parada WHERE CODIGO = ?; ");
    // q2.setParameter( 1, 1 );
    // Double resultado2 = (Double) q2.getSingleResult();
    //
    // coordenada.setLongitud(resultado);
    // coordenada.setLatitud(resultado2);
    //
    // Collection<Coordenada> lista = new ArrayList<Coordenada>();
		// lista.add(coordenada);

    Query q = getEntityManager().createNativeQuery("SELECT (ST_X(coordenada)), (ST_Y(coordenada)) FROM parada");
    List<Object[]> coordenadas = (List<Object[]>) q.getResultList();

    List<Coordenada> lista = new ArrayList<Coordenada>();

    for(Object[] item: coordenadas){
      lista.add(new Coordenada(item));
    }

    return lista;
  }

  public List<Parada> findAllParadas() {
    Query query = getEntityManager().createNativeQuery("SELECT codigo,observacion FROM parada");
    List<Object[]> paradas = (List<Object[]>) query.getResultList();

    List<Parada> lista = new ArrayList<Parada>();

    for(Object[] item: paradas){
      lista.add(new Parada(item));
    }

    return lista;
  }

}
