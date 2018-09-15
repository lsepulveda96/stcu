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

  @Column(name="OBSERVACION")
  private String observacion;

  public Parada() {}

  public Parada( Object[] rows){
    this.codigo = (int) rows[0];
    this.observacion = (String) rows[1];
  }

  public int getCodigo() { return codigo; }

  public void setCodigo( int cod ) { this.codigo = cod; }

  public String getObservacion() { return observacion; }

  public void setObservacion( String observacion ) { this.observacion = observacion; }
}
