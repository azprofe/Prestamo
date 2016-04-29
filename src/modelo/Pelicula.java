package modelo;
import java.io.Serializable;

/**
 * 
 * @author departamento
 */
public class Pelicula extends Articulo implements Serializable{

  public Articulo id_artic;

  public String director;

  public Integer duracion;

  public Integer anno;

}