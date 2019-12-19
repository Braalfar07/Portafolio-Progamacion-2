/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases;

import Entidades.Estudiante;

/**
 *
 * @author Jherom Chacon
 */
public class EjemploClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante miEstudiante = new Estudiante();
        System.out.println(miEstudiante.nombre.equals("Carlitos"));
        miEstudiante.estudiar();
    }
    
}
