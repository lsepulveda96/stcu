package stateless;

import java.util.Collection;

import javax.persistence.EntityManager;

import model.Colectivo;

public interface ColectivoService {
  public Collection<Colectivo> findAllColectivos();
  public void setEntityManager(EntityManager em);
}
