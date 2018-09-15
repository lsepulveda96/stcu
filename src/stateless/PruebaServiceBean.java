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
public class PruebaServiceBean implements PruebaService {
  @PersistenceContext(unitName="stcu")
  protected EntityManager em;

  public void setEntityManager(EntityManager emLocal){
    em = emLocal;
  }

  public EntityManager getEntityManager() {
    return em;
  }

  public List<Coordenada> findParada() {

    Query q = getEntityManager().createNativeQuery("SELECT ST_X(coordenada), ST_Y(coordenada),observacion FROM parada");
    List<Object[]> coordenadas = (List<Object[]>) q.getResultList();

    List<Coordenada> lista = new ArrayList<Coordenada>();

    for(Object[] item: coordenadas){
      lista.add(new Coordenada(item));
    }
    return lista;
  }


}
