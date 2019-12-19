/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Estudiante {
    public int idEstudiante;
    public String nombre;
    public String apellido;
    
    public Estudiante(){
        this.nombre = "Carlitos";
        this.idEstudiante = 0;
        this.apellido = "Lopez";
    }
    
    public void estudiar(){
        System.out.println("Estudiando...");
    }
}
