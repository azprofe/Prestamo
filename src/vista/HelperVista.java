/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author departamento
 */
public class HelperVista {
     public static void centrarPantalla(JFrame pantalla){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla.setLocation(dim.width / 2 - pantalla.getSize().width / 2, dim.height / 2 - pantalla.getSize().height / 2);
    } 
     /**
      * Comprueba que una cadena es un numero
      * @param cadena
      * @return [true] si la cadena es un int, [false] si la cadena no es un int
      */
     public static boolean isNumber(String cadena){
         boolean vuelta = true;
         try {
             Integer.parseInt(cadena);
         } catch (Exception e) {
             vuelta = false;
         }
         return vuelta;
     }
}
