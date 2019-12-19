/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerPeliculas;

/**
 *
 * @author Brandon Alpizar
 */
public class Terror extends Pelicula{

    @Override
    public void calcularPrecio() {
        this.precio = (this.precio*0.10)+this.precio;
    }
}
