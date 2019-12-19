/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg5;

import static java.lang.Math.PI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Practica5 {

   
    public static void main(String[] args) {
             JFrame frame = new JFrame();
       String Radio = JOptionPane.showInputDialog(frame, "Cual es el radio?");
        int Numero = Integer.parseInt(Radio);
        Numero = Numero * 2;
        double Area = Math.PI * Numero;
        System.out.println("El area de la circunferencia: "+  Area);
    }
    
}
