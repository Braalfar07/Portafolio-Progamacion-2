/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Persona {

    public String nombre;
    public String apellido;
    public int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getapellido() {
        return this.apellido;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public int getedad() {
        return this.edad;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public String getsexo() {
        return this.sexo;
    }
}
