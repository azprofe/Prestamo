package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author departamento
 */
@Entity
@Table(name = "Articulo_es_prestado")
public class Prestamo implements Serializable {

    @Id
    @Column(name = "id_prestamo")
    private Integer id_prestamo;

    @Column(name = "id_amigo")
    @OneToOne
    @PrimaryKeyJoinColumn
    private Amigo id_amigo;

    @Column(name = "id_artic")
    @OneToOne
    @PrimaryKeyJoinColumn
    private Articulo id_artic;

    @Column(name = "fecha_prest")
    @Temporal(TemporalType.DATE)
    private Date fecha_prest;

    @Column(name = "fecha_devol")
    @Temporal(TemporalType.DATE)
    private Date fecha_devol;

    @Column(name = "devuelto")
    private Boolean devuelto;

    public Prestamo() {
    }

    public Prestamo(Integer id_prestamo, Amigo id_amigo, Articulo id_artic, Date fecha_prest, Date fecha_devol, Boolean devuelto) {
        this.id_prestamo = id_prestamo;
        this.id_amigo = id_amigo;
        this.id_artic = id_artic;
        this.fecha_prest = fecha_prest;
        this.fecha_devol = fecha_devol;
        this.devuelto = devuelto;
    }

    public Integer getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(Integer id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Amigo getId_amigo() {
        return id_amigo;
    }

    public void setId_amigo(Amigo id_amigo) {
        this.id_amigo = id_amigo;
    }

    public Articulo getId_artic() {
        return id_artic;
    }

    public void setId_artic(Articulo id_artic) {
        this.id_artic = id_artic;
    }

    public Date getFecha_prest() {
        return fecha_prest;
    }

    public void setFecha_prest(Date fecha_prest) {
        this.fecha_prest = fecha_prest;
    }

    public Date getFecha_devol() {
        return fecha_devol;
    }

    public void setFecha_devol(Date fecha_devol) {
        this.fecha_devol = fecha_devol;
    }

    public Boolean getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(Boolean devuelto) {
        this.devuelto = devuelto;
    }

}
