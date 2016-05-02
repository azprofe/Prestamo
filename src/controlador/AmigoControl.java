/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Amigo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Adrian
 */
public class AmigoControl {

    private final Session sesion;

    public AmigoControl(Session sesion) {
        this.sesion = sesion;
    }
    /**
     * 
     * @param nombre
     * @param apellido
     * @param direccion
     * @param tlf
     * @param moroso
     * @return 
     */
    public boolean nuevoAmigo(String nombre, String apellido, String direccion, int tlf, boolean moroso) {
        Amigo a = new Amigo(nombre, apellido, direccion, tlf, moroso);
       sesion.save(a);
        
        return true;
    }
}
