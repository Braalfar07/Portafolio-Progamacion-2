/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon Alpizar
 */
public class Granja {

    public static void main(String[] args) {
        int Aleatorio;
        Gatos gato= new Gatos ();
       Perros  perro = new Perros ();
       Vacas vaca = new Vacas ();
       Cerdo cerdo = new Cerdo ();
        
       while(true){
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Granja.class.getName()).log(Level.SEVERE, null, ex);
            }
       Aleatorio = (int) (Math.random() * 4) + 1;
           if (Aleatorio == gato.getFicha()) {
    
               gato.SumaCont();
               System.out.println("Gato"+ gato.getCont()); 
               gato.Hablar();
               
           }else if (Aleatorio == perro.getFicha()) {
               perro.SumaCont();
               System.out.println("Perro"+ perro.getCont()); 
               perro.Hablar();
           }else if (Aleatorio == vaca.getFicha()) {
               vaca.SumaCont();
               System.out.println("Vaca"+ vaca.getCont()); 
               vaca.Hablar();
           }else if (Aleatorio == cerdo.getFicha()) {
               cerdo.SumaCont();
               System.out.println("Cerdo"+ cerdo.getCont()); 
               cerdo.Hablar();
           }
     
     
       
       
       }  }
    
}
