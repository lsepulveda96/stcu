package stateless;

import java.util.Collection;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Linea;
import java.util.Map;
import java.lang.reflect.Method;

@Stateless
public class LineaServiceBean implements LineaService {
  @PersistenceContext(unitName="stcu")
  protected EntityManager em;

  public void setEntityManager(EntityManager emLocal){
    em = emLocal;
  }

  public EntityManager getEntityManager() {
    return em;
  }

  public Linea createLinea(Linea est) {
    getEntityManager().persist(est);
    return est;
  }

  public Linea removeLinea(int id) {
    Linea est = findLinea(id);
    if (est != null) {
      getEntityManager().remove(est);
      return est;
    } else return null;
  }

  // public Linea changeLinea(int id, String newNombre, String newDescripcion, String newObservaciones) {
  //   Linea est = findLinea(id);
  //   if (est != null) {
  //     est.setNombre(newNombre);
  //     est.setDescripcion(newDescripcion);
  //     est.setObservaciones(newObservaciones);
  //   }
  //   return est;
  // }

  public Linea findLinea(int id) {
    return getEntityManager().find(Linea.class, id);
  }

  public Collection<Linea> findAllLineas() {
    Query query = getEntityManager().createQuery("SELECT e FROM Linea e");
    return (Collection<Linea>) query.getResultList();
  }

  // public Page<Linea> findByPage(Integer page, Integer cantPerPage, Map<String, String> parameters) {
  //   StringBuffer where = new StringBuffer(" WHERE 1=1");
  //   if (parameters != null)
  //   for (String param : parameters.keySet()) {
  //     Method method;
  //     try {
  //       method = Linea.class.getMethod("get" + capitalize(param));
  //       if (method == null) {
  //         continue;
  //       }
  //       switch (method.getReturnType().getSimpleName()) {
  //         case "String":
  //         where.append(" AND UPPER(");
  //         where.append(param);
  //         where.append(") LIKE UPPER(");
  //         where.append(parameters.get(param));
  //         where.append(")");
  //         break;
  //         default:
  //         where.append(" AND ");
  //         where.append(param);
  //         where.append(" = ");
  //         where.append(parameters.get(param));
  //         break;
  //       }
  //     } catch (NoSuchMethodException | SecurityException e) {
  //       // TODO Auto-generated catch block
  //       e.printStackTrace();
  //     }
  //   }
  //   Query countQuery = em
  //   .createQuery("SELECT COUNT(u.id) FROM " + Linea.class.getSimpleName() + " u" + where.toString());
  //   Query query = em.createQuery("FROM " + Linea.class.getSimpleName() + " u" + where.toString());
  //   query.setMaxResults(cantPerPage);
  //   query.setFirstResult((page - 1) * cantPerPage);
  //   Integer count = ((Long) countQuery.getSingleResult()).intValue();
  //   Integer lastPage = (int) Math.ceil((double) count / (double) cantPerPage);
  //   Page<Linea> resultPage = new Page<Linea>(page, count, page > 1 ? page - 1 : page,
  //   page > lastPage ? page + 1 : lastPage, lastPage, query.getResultList());
  //   return resultPage;
  // }
  //
  // private String capitalize(final String line) {
  //   return Character.toUpperCase(line.charAt(0)) + line.substring(1);
  // }


}
