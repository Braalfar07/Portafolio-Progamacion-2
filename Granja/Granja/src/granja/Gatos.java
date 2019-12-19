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
public class Gatos {
    private int Ficha = 1;
    private int Cont ;
    private String Habla = "Miau";

    public int getCont() {
        return Cont;
    }

    public void setCont(int Cont) {
        this.Cont = Cont;
    }

    public String getHabla() {
        return Habla;
    }

    public void setHabla(String Habla) {
        this.Habla = Habla;
    }
    
public void Hablar (){
    System.out.println(Habla);

}

public void SumaCont(){
Cont=Cont +1;

}

    public int getFicha() {
        return Ficha;
    }

    public void setFicha(int Ficha) {
        this.Ficha = Ficha;
    }


}
