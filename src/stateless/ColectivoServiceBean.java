package stateless;

import java.util.Collection;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Colectivo;

@Stateless
public class ColectivoServiceBean implements ColectivoService {

  // @PersistenceContext(unitName="STCUService")
  @PersistenceContext(unitName="stcu")
  protected EntityManager em;

  public void setEntityManager( EntityManager emlocal ) {
    em = emlocal;
  }

  public EntityManager getEntityManager() {
    return em;
  }

  public Collection<Colectivo> findAllColectivos() {
    Query query = getEntityManager().createQuery("Select c FROM Colectivo c");
    return (Collection<Colectivo>)query.getResultList();
  }

}
