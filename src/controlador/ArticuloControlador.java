/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Articulo;
import modelo.Libro;

/**
 *
 * @author departamento
 */
public class ArticuloControlador {

    private Controlador control;

    public ArticuloControlador(Controlador control) {
        this.control = control;
    }

    /**
     * Implementa un nuevo articulo, asigna la posicion del arrayList de
     * articulos a id_articulo
     *
     * @param nombre
     * @param info
     * @param ubicacion
     * @return Articulo implementado.
     */
    public Articulo nuevoArticulo(String nombre, String info, String ubicacion) {
        Articulo art = new Articulo();
        art.setNombre_artic(nombre);
        art.setInfo(info);
        art.setUbicacion_artic(ubicacion);
        art.setId_artic(control.getListaArticulos().size());
        return art;
    }

    /**
     * Implementa un nuevo libro y lo guarda en el arrayList de articulos
     * @param escritor
     * @param numPaginas
     * @param saga
     * @param art
     * @return [true] si la operación es correcta, [false] en caso contrario
     */
    public boolean nuevoLibro(String escritor, int numPaginas, boolean saga, Articulo art) {
        boolean vuelta = true;
        try {
            Libro lb = new Libro();
            lb.setSaga(saga);
            lb.setEscritor(escritor);
            lb.setNum_pagin(numPaginas);
            lb.setId_artic(art.getId_artic());
            lb.setNombre_artic(art.getNombre_artic());
            lb.setUbicacion_artic(art.getUbicacion_artic());
            lb.setInfo(art.getInfo());
            control.getListaArticulos().add(lb);
        } catch (Exception e) {
            vuelta = false;
        }

        return vuelta;
    }
}
