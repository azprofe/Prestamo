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
public class Serie extends Articulo implements Serializable{

  @Column(name="director")
  private String director;

  @Column(name="temporada")
  private Integer temporada;

  @Column(name="anno")
  private Integer anno;

  @Column(name="num_capit")
  private Integer num_capit;

    public Serie(){}

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    public Integer getNum_capit() {
        return num_capit;
    }

    public void setNum_capit(Integer num_capit) {
        this.num_capit = num_capit;
    }


}