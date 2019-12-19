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
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;
    public abstract void 
            setnombre(String nombre);
    public abstract String getnombre();
    public abstract void 
            setapellido(String apellido);
    public abstract String getapellido();
    public abstract void 
            setedad(int edad);
    public abstract int getedad();
    public abstract void 
            setsexo(String sexo);
    public abstract String getsexo();
    public static void saludar(){
        System.out.println("hola!");}
    
}
