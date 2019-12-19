/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerPeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Brandon Alpizar
 */
public class Alquiler {

    public static void main(String[] args) {

        List<Pelicula> listaPeliculas = new ArrayList<>();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            //Menu Principal
            System.out.println("----------------------------");
            System.out.println("1. Crear Pelicula           ");
            System.out.println("2. Mostrar Peliculas creadas");
            System.out.println("3. Salir                    ");
            System.out.println("----------------------------");
            System.out.println("Elija una opcion            ");
            opcion = sn.nextInt();
            Pelicula pelicula = new Pelicula();
            switch (opcion) {
                case 1:
                    int opcionGenero;
                    System.out.println("Crear Pelicula");
                    System.out.println("Seleccione el genero:");
                    System.out.println("1. Terror            ");
                    System.out.println("2. Accion            ");
                    System.out.println("3. Comedia           ");
                    System.out.println("4. Drama             ");
                    opcionGenero = sn.nextInt();

                    switch (opcionGenero) {
                        case 1:
                            pelicula = new Terror();                            
                            break;
                        case 2:
                            pelicula = new Accion();
                            break;
                        case 3:
                            pelicula = new Comedia();
                            break;
                        case 4:
                            pelicula = new Drama();
                            break;
                        default:{
                            System.out.println("Opcion no encontrada");
                            break;
                        }
                    }
                    
                    System.out.println("Digite el nombre:");
                    pelicula.setNombre(sn.next());
                    System.out.println("Digite el nombre del director:");
                    pelicula.setDirector(sn.next());
                    System.out.println("Digite el nombre del productor:");
                    pelicula.setProductor(sn.next());
                    System.out.println("Digite el nombre de la casa:");
                    pelicula.setCasa(sn.next());
                    System.out.println("Digite el nombre del protagonista:");
                    pelicula.setProtagonista(sn.next());
                    System.out.println("Digite la duracion:");
                    pelicula.setDuracion(sn.next());
                    System.out.println("Digite el precio:");
                    pelicula.setPrecio(sn.nextDouble());
                    pelicula.calcularPrecio();
                    listaPeliculas.add(pelicula);
                    System.out.println("\n");
                    System.out.println("Pelicula agregada exitosamente.");
                    System.out.println("\n");
                    break;
                case 2:
                    for (Pelicula p : listaPeliculas) {
                        System.out.println("----------------------------");
                        System.out.println("Nombre: " + p.geNombre());
                        System.out.println("Director: " + p.getDirector());
                        System.out.println("Productor: " + p.getProductor());
                        System.out.println("Casa: " + p.getCasa());
                        System.out.println("Protagonista: " + p.getProtagonista());
                        System.out.println("Duracion: " + p.getDuracion());
                        System.out.println("Precio: " + p.getPrecio());
                        System.out.println("----------------------------");

                        System.out.println("\n");
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
        }

    }
}
