
package modelo;
import java.io.Serializable;
import javax.persistence.*;

/**
 * 
 * @author departamento
 */
@Entity
@Table(name="amigo")
public class Amigo implements Serializable {

  @Id
  @GeneratedValue
  @Column(name="id_amigo")
  private int id_amigo;

  @Column(name="nombr_amigo")
  private String nombr_amigo;

  @Column(name="apellid_amigo")
  private String apellid_amigo;

  @Column(name="direcc_amigo")
  private String direcc_amigo;

  @Column(name="tlf_amigo")
  private int tlf_amigo;

  @Column(name="moroso")
  private Boolean moroso;

    public Amigo() {
    }

    public Amigo( String nombr_amigo, String apellid_amigo, String direcc_amigo, int tlf_amigo, Boolean moroso) {
        this.nombr_amigo = nombr_amigo;
        this.apellid_amigo = apellid_amigo;
        this.direcc_amigo = direcc_amigo;
        this.tlf_amigo = tlf_amigo;
        this.moroso = moroso;
    }

    public int getId_amigo() {
        return id_amigo;
    }

    public void setId_amigo(int id_amigo) {
        this.id_amigo = id_amigo;
    }

    public String getNombr_amigo() {
        return nombr_amigo;
    }

    public void setNombr_amigo(String nombr_amigo) {
        this.nombr_amigo = nombr_amigo;
    }

    public String getApellid_amigo() {
        return apellid_amigo;
    }

    public void setApellid_amigo(String apellid_amigo) {
        this.apellid_amigo = apellid_amigo;
    }

    public String getDirecc_amigo() {
        return direcc_amigo;
    }

    public void setDirecc_amigo(String direcc_amigo) {
        this.direcc_amigo = direcc_amigo;
    }

    public int getTlf_amigo() {
        return tlf_amigo;
    }

    public void setTlf_amigo(int tlf_amigo) {
        this.tlf_amigo = tlf_amigo;
    }

    public Boolean getMoroso() {
        return moroso;
    }

    public void setMoroso(Boolean moroso) {
        this.moroso = moroso;
    }

}