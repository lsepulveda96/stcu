package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="PARADA")
public class Parada {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="CODIGO")
  private int codigo;

  @Column(name="DIRECCION")
  private String direccion;

  public Parada() {}

  public Parada( Object[] rows){
    this.codigo = (int) rows[0];
    this.direccion = (String) rows[1];
  }

  public int getCodigo() { return codigo; }

  public void setCodigo( int cod ) { this.codigo = cod; }

  public String getDireccion() { return direccion; }

  public void setDireccion( String direccion ) { this.direccion = direccion; }
}
