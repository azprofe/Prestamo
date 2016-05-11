/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Amigo;
//import org.hibernate.*;

/**
 *
 * @author Adrian
 */
public class AmigoControl {

//    private final Session sesion;
    private final Controlador control;

//    public AmigoControl(Session sesion) {
//        this.sesion = sesion;
//    }
    public AmigoControl(Controlador control){
        this.control = control;
    }

//    /**
//     *
//     * @param nombre
//     * @param apellido
//     * @param direccion
//     * @param tlf
//     * @param moroso
//     * @return
//     */
//    public boolean nuevoAmigo(String nombre, String apellido, String direccion, int tlf, boolean moroso, boolean hola) {
//        boolean valor = true;
//        try {
//            Amigo a = new Amigo(nombre, apellido, direccion, tlf, moroso);
//            System.out.println(a);
//            sesion.beginTransaction();
//            sesion.save(a);
//            sesion.getTransaction().commit();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            valor = false;
//        }
//
//        return valor;
//    }

    /**
     * Crea un nuevo amigo y lo guarda en el arrayList de amigos
     * @param nombre
     * @param apellido
     * @param direccion
     * @param tlf
     * @param moroso
     * @return devuelve [true] si se ha creado con exito, [false] si ha fallado la operación
     */
    public boolean nuevoAmigo(String nombre, String apellido, String direccion, int tlf, boolean moroso) {
        boolean vuelta = true;
        try {
            Amigo a = new Amigo(nombre, apellido, direccion, tlf, moroso);
            a.setId_amigo(control.getListaAmigos().size());
            control.getListaAmigos().add(a);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            vuelta = false;
        }

        return vuelta;
    }
    

}
