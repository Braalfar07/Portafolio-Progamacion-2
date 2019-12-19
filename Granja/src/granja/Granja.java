/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon Alpizar
 */
public class Granja {

    public static void main(String[] args) {
        int numeroRandom;
        int conteoCerdos = 0;
        int conteoGatos = 0;
        int conteoPerros = 0;
        int conteoVacas = 0;

        List<Animal> listaAnimales = new ArrayList<>();
        while (true) {
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Granja.class.getName()).log(Level.SEVERE, null, ex);
            }
            numeroRandom = (int) (Math.random() * 4) + 1;
            switch (numeroRandom) {
                case 1:
                    // Cerdo     
                    Animal cerdo = new Cerdo();
                    listaAnimales.add(cerdo);
                    conteoCerdos++;
                    cerdo.setConteo(conteoCerdos);
                    //cerdo.hablar();
                    System.out.println("Cerdo creado - contador= " + cerdo.getConteo());
                    break;
                case 2:
                    // Gato
                    Animal gato = new Gato();
                    listaAnimales.add(gato);
                    conteoGatos++;
                    gato.setConteo(conteoGatos);
                    //gato.hablar();
                    System.out.println("Gato creado - contador= " + gato.getConteo());
                    break;
                case 3:
                    // Perro
                    Animal perro = new Perro();
                    listaAnimales.add(perro);
                    conteoPerros++;
                    perro.setConteo(conteoPerros);
                    //perro.hablar();
                    System.out.println("Perro creado - contador= " + perro.getConteo());
                    break;
                case 4:
                    // Vaca
                    Animal vaca = new Vaca();
                    listaAnimales.add(vaca);
                    conteoVacas++;
                    vaca.setConteo(conteoVacas);
                    //vaca.hablar();
                    System.out.println("Vaca creada - contador= " + vaca.getConteo());
                    break;
                default:
                    // Ninguno
                    System.out.println("Animal no encontrado");
            }
            //System.out.println("\n");
            if (listaAnimales.size() >= 4) {
                System.out.println("\n");
                System.out.println("Total animales en la lista: " + listaAnimales.size());
                for (int i = 0; i < 4; i++) {
                    // Mostrar ultimos 4 animales agregados - buscado en google 
                    listaAnimales.get(listaAnimales.size() - (i + 1)).hablar();
                }
            }

        }
    }
}
