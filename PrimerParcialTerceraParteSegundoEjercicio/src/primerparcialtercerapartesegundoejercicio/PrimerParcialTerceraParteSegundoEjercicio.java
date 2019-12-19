/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import entidades.Persona;
import util.Utilidades;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.edad = 18;
        persona.nombre = "Carlitos";
        persona.setsexo("Masculino");
        persona.setapellido("Velez");

        Utilidades Util = new Utilidades() {
        };
        int resultado = Util.suma(1, 1);
        int resultadoResta = Util.resta(3, 2);

        System.out.println("Nombre : " + persona.getnombre());
        System.out.println("Apellido : " + persona.getapellido());
        System.out.println("Sexo : " + persona.getsexo());
        System.out.println("Edad : " + persona.edad);
        System.out.println("Resultado suma  : " + resultado);
        System.out.println("Resultado suma  : " + resultadoResta);
    }
}
