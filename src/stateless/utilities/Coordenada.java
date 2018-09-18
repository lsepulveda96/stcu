package stateless.utilities;

import java.util.Collection;
import javax.persistence.EntityManager;
import model.Linea;
import java.util.Map;

public class Coordenada {

  private Double latitud;
  private Double longitud;
  private String direccion;

  public Coordenada(Double latitud, Double longitud) {
    this.latitud = latitud;
    this.longitud = longitud;
  }

  public Coordenada(){}

  public Coordenada( Object[] rows){
    this.latitud = (Double) rows[0];
    this.longitud = (Double) rows[1];
    this.direccion = (String) rows[2];
  }

  public Double getLatitud() { return latitud; }

  public void setLatitud( Double latitud ) { this.latitud = latitud; }

  public Double getLongitud() { return longitud; }

  public void setLongitud( Double longitud ) { this.longitud = longitud; }

  public String getDireccion() { return direccion; }

  public void setDireccion( String direccion ) { this.direccion = direccion; }

}
