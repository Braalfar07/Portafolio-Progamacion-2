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
public class Animal {
    private int conteo;
    
    
    public Animal(){
        conteo=0;
    }
    public void hablar(){
        System.out.println("Grr...");
    }
    
    public void setConteo(int conteo){
        this.conteo = conteo;
    }
    
    public int getConteo(){
        return conteo;
    }
}
