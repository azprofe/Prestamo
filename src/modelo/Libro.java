package modelo;
import java.io.Serializable;

/**
 * 
 * @author departamento
 */
public class Libro extends Articulo implements Serializable{

  public Articulo id_artic;

  public String escritor;

  public Boolean saga;

  public Integer num_pagin;

}