/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Brandon Alpizar
 */
public class Computadoras {

    public String Pantalla;
    private String Procesador;
    public String Marca;

    public Computadoras() {
    }

    public Computadoras(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public Computadoras(String Pantalla, String marca) {
        this.Pantalla = Pantalla;
        this.Marca = marca;
    }

    public Computadoras(String Pantalla, String marca, String procesador) {
        this.Pantalla = Pantalla;
        this.Marca = marca;
        this.Procesador = procesador;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setProcesador(String procesador) {
        this.Procesador = procesador;
    }

    public String getProcesador() {
        return this.Procesador;
    }

    public void setPantalla(String DiscoDuro) {
        this.Pantalla = DiscoDuro;
    }

    public String getPantalla() {
        return this.Pantalla;
    }

}
