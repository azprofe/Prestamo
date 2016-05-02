package modelo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 
 * @author departamento
 */
@Entity
@Table(name="tipo_juego")
public class TipoJuego implements Serializable{

  @Id
  @Column(name="id_tipo_jueg")
  private Integer id_tipo_jueg;
  
  @Column(name="tipo_jueg")
  private String tipo_jueg;

    public TipoJuego() {
    }

    public TipoJuego(Integer id_tipo_jueg, String tipo_jueg) {
        this.id_tipo_jueg = id_tipo_jueg;
        this.tipo_jueg = tipo_jueg;
    }

    public Integer getId_tipo_jueg() {
        return id_tipo_jueg;
    }

    public void setId_tipo_jueg(Integer id_tipo_jueg) {
        this.id_tipo_jueg = id_tipo_jueg;
    }

    public String getTipo_jueg() {
        return tipo_jueg;
    }

    public void setTipo_jueg(String tipo_jueg) {
        this.tipo_jueg = tipo_jueg;
    }


}