/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import modelo.Amigo;
import modelo.Articulo;
import modelo.Prestamo;
import modelo.TipoJuego;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Adrian
 */
public class Controlador {

    private Session sesion;
    private List<Amigo> listaAmigos;
    private List<Articulo> listaArticulos;
    private List<Prestamo> listaPrestamo;
    private List<TipoJuego> listaTipoJuego;
    
    public Controlador() {
        try {
            SessionFactory sessionFactory;
            Configuration configuration = new Configuration();
            configuration.configure();
            StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            sessionFactory = configuration.buildSessionFactory(serviceRegistry.build());
            this.sesion = sessionFactory.openSession();
        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
    }

    public Controlador(boolean hola){
        listaAmigos = new ArrayList<>();
        listaArticulos = new ArrayList<>();
        listaPrestamo = new ArrayList<>();
        listaTipoJuego = new ArrayList<>();
    }
    
    public boolean cerrarSesion() {
        boolean vuelta = false;
        if (sesion.isOpen()) {
            sesion.close();
            vuelta = true;
        }
        return vuelta;
    }

    public Session getSesion() {
        return sesion;
    }

    public List<Amigo> getListaAmigos() {
        return listaAmigos;
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public List<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public List<TipoJuego> getListaTipoJuego() {
        return listaTipoJuego;
    }
    
}
