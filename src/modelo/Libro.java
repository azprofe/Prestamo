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
public class Libro extends Articulo implements Serializable{

  @Column(name="escritor")
  private String escritor;

  @Column(name="saga")
  private Boolean saga;

  @Column(name="num_pagin")
  private int num_pagin;

    public Libro() {
    }


    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public Boolean getSaga() {
        return saga;
    }

    public void setSaga(Boolean saga) {
        this.saga = saga;
    }

    public int getNum_pagin() {
        return num_pagin;
    }

    public void setNum_pagin(int num_pagin) {
        this.num_pagin = num_pagin;
    }


}