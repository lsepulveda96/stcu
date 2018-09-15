package stateless;

import java.util.Collection;
import javax.persistence.EntityManager;
import model.Linea;
import java.util.Map;

public interface LineaService {
    public void setEntityManager(EntityManager em);
    public Linea createLinea(Linea linea);
    public Linea removeLinea(int id);
    // public Linea changeLinea(int id, String newNombre, String newDescripcion, String newObservaciones);
    public Linea findLinea(int id);
    public Collection<Linea> findAllLineas();
    // public Page<Linea> findByPage(Integer page, Integer cantPerPage, Map<String, String> parameters);
}
