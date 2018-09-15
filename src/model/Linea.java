package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="LINEA")
public class Linea {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="CODIGO")
  private int codigo;

  @Column(name="DENOMINACION", nullable=false)
  private String denominacion;

  public Linea() {}

  public int getCodigo() { return codigo; }
  
  public void setCodigo( int cod ) { this.codigo = cod; }

  public String getDenominacion() { return this.denominacion; }

  public void setDenominacion( String de ) { this.denominacion = de; }

}
  
