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
public class Pelicula extends Articulo implements Serializable{


  @Column(name="director")
  private String director;

  @Column(name="duracion")
  private int duracion;

  @Column(name="anno")
  private int anno;

    public Pelicula() {
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }


}