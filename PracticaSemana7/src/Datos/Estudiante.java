/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Laboratorio
 */
public class Estudiante extends Persona {
    private String sexo;  
    public Estudiante(){}
    public Estudiante(String nombre){
    this.nombre=nombre;
    }
    public Estudiante(String nombre,String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
    }
    public Estudiante(String nombre,String apellido,int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    }
    public Estudiante(String nombre,String apellido,int edad,String sexo){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.sexo=sexo;
    }

    @Override
    public void setnombre(String nombre) {
    this.nombre=nombre;    
    }

    @Override
    public String getnombre() {
    return this.nombre;  
    }

    @Override
    public void setapellido(String apellido) {
    this.apellido=apellido;
    }

    @Override
    public String getapellido() {
    return this.apellido;
    }

    @Override
    public void setedad(int edad) {
    this.edad=edad; 
    }

    @Override
    public int getedad() {
    return this.edad;
    }
  
    @Override
    public void setsexo(String sexo) {
    this.sexo=sexo;
    }

    @Override
    public String getsexo() {
    return this.sexo;
    }
}
