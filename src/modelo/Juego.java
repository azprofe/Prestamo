package modelo;
import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * @author departamento
 */
@Entity
@Table(name="articulo")
@PrimaryKeyJoinColumn(name="id_artic")  
public class Juego extends Articulo implements Serializable{

  @Column(name="duracion")
  private int duracion;

  @Column(name="num_jugad")
  private int num_jugad;

  @Column(name="tematica")
  private String tematica;

  @Column(name="id_tipo_jueg")
  private TipoJuego id_tipo_jueg;



    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNum_jugad() {
        return num_jugad;
    }

    public void setNum_jugad(int num_jugad) {
        this.num_jugad = num_jugad;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public TipoJuego getId_tipo_jueg() {
        return id_tipo_jueg;
    }

    public void setId_tipo_jueg(TipoJuego id_tipo_jueg) {
        this.id_tipo_jueg = id_tipo_jueg;
    }


}