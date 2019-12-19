/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasemana7;

import Datos.Estudiante;
import Datos.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class PracticaSemana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList<Persona>();
        Persona fulanito = new Estudiante ();
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite el Nombre ");//solicitamos nombre al usuario
        fulanito.setnombre(Teclado.next());
        System.out.println("Digite el Apellido ");
        fulanito.setapellido(Teclado.next());
        System.out.println("Digite el Sexo ");
        fulanito.setsexo(Teclado.next());
        System.out.println("Digite el Edad ");
        fulanito.setedad(Teclado.nextInt());
        personas.add(fulanito);
        printPersonas(personas);
           
      
    }
    
    public static void printPersonas(List<Persona> personas) {
        personas.stream().map((persona) -> {
            System.out.println("\n" +"Nombre= "+persona.getnombre());
            return persona;
        }).map((persona) -> {
            System.out.println("Apellido= "+persona.getapellido());
            return persona;
        }).map((persona) -> {
            System.out.println("Sexo= "+persona.getsexo());
            return persona;
        }).forEachOrdered((persona) -> {
            System.out.println("Edad= "+persona.getedad());
        });
    }

}
