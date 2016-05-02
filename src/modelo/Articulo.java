package modelo;
import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * @author departamento
 */
@Entity
@Table(name="articulo")
@Inheritance(strategy=InheritanceType.JOINED)  
public class Articulo implements Serializable{

  @Id
  @GeneratedValue
  @Column(name="id_artic")
  private Integer id_artic;

  @Column(name="nombre_artic")
  private String nombre_artic;

  @Column(name="ubicacion_artic")
  private String ubicacion_artic;

  @Column(name="info")
  private String info;

    public Articulo(){
    }
    
    public Integer getId_artic() {
        return id_artic;
    }

    public void setId_artic(Integer id_artic) {
        this.id_artic = id_artic;
    }

    public String getNombre_artic() {
        return nombre_artic;
    }

    public void setNombre_artic(String nombre_artic) {
        this.nombre_artic = nombre_artic;
    }

    public String getUbicacion_artic() {
        return ubicacion_artic;
    }

    public void setUbicacion_artic(String ubicacion_artic) {
        this.ubicacion_artic = ubicacion_artic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}