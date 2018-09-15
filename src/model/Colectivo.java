package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
// import org.postgis.*;

// import org.postgis.Geometry;
// import java.io.Serializable;
// import model.Punto;

@Entity
@Table(name="COLECTIVO")
public class Colectivo {

  // private static final long serialVersionUID = 1L;

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;

  @Column(name="CAPACIDAD", nullable=true)
  private int capacidad;

  @Column(name="PATENTE", nullable=false)
  private String patente;

  // @Column(name="PUNTO", columnDefinition="geometry")
  // private Point punto;

  public Colectivo() {}

  public int getId() { return id; }

  public void setId( int id ) { this.id = id; }

  public String getPatente() { return this.patente; }

  public void setPatente( String pat ) { this.patente = pat; }

  public int getCapacidad() { return this.capacidad; }

  public void setCapacidad( int cap ) { this.capacidad = cap; }
}
