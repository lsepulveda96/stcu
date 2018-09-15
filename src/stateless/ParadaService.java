package stateless;

import java.util.Collection;
import javax.persistence.EntityManager;
import model.Parada;
import java.util.Map;
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
import java.util.List;


public interface ParadaService {

    public void setEntityManager(EntityManager em);
    public EntityManager getEntityManager();
    public Parada createParada(String newPunto, String newDireccion) throws RollbackException, NotSupportedException;
    // public Parada removeParada(int id);
    // public Parada findParada(int id);
    // public Collection<Parada> findAllParadas();
    public List<Parada> findAllParadas();
    public List<Coordenada> findParada();

}
