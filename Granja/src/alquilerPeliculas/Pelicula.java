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
public class Pelicula {

    private String nombre;
    private String director;
    private String productor;
    private String casa;
    private String protagonista;
    private String duracion;
    protected Double precio;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, String productor, String casa, String protagonista, String duracion, Double precio) {
        this.nombre = nombre;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
        this.precio = precio;
    }

    public String geNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void calcularPrecio() {
    }

}
