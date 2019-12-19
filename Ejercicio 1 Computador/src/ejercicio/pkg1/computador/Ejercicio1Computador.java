/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.computador;

import Entidad.Computadoras;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brandon Alpizar
 */
public class Ejercicio1Computador {

    public static void main(String[] args) {

        List<Computadoras> Lista = new ArrayList<Computadoras>();

        Computadoras Alienware = new Computadoras();

        Alienware.setProcesador("2.9GHz Intel Core i9-8950HK");
        Alienware.setPantalla("17.3-inch, QHD");
        Alienware.setMarca("Alienware");

        System.out.println("Marca = " + Alienware.getMarca());
        System.out.println("Procesador = " + Alienware.getProcesador());
        System.out.println("Pantalla = " + Alienware.getPantalla() + "\n");

        Computadoras DELL = new Computadoras();

        DELL.setProcesador("Celeron Dual Core");
        DELL.setPantalla("11.6 inch display");
        DELL.setMarca("DELL");

        System.out.println("Marca = " + DELL.getMarca());
        System.out.println("Procesador = " + DELL.getProcesador());
        System.out.println("Pantalla = " + DELL.getPantalla() + "\n");

    }

}
