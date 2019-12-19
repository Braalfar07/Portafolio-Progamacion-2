/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author Brandon Alpizar
 */
public class Perro extends Animal{

    public Perro(){
        super();
    }
    
    @Override
    public void hablar(){
        System.out.println("GUAU");
    }
}
