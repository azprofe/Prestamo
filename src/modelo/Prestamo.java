package modelo;
import java.io.Serializable;

/**
 * 
 * @author departamento
 */
public class Prestamo implements Serializable{

  public Integer id_prestamo;

  public Amigo id_amigo;

  public Articulo id_artic;

  public Integer fecha_prest;

  public Integer fecha_devol;

  public Boolean devuelto;

}