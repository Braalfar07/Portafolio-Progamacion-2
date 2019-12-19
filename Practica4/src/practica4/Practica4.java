/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Practica4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
     String Nombre = JOptionPane.showInputDialog(frame, "Cual es tu nombre?");
        System.out.println("Bienvenido " + Nombre);
    }
    
}
