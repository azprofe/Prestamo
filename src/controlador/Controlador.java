/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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

}
