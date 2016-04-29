package modelo;
import java.io.Serializable;

/**
 * 
 * @author departamento
 */
public class Juego extends Articulo implements Serializable{

  public Articulo id_artic;

  public Integer duracion;

  public Integer num_jugad;

  public String tematica;

  public TipoJuego id_tipo_jueg;


}