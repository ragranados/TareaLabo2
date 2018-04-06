/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;

/**
 *
 * @author rau3
 */
public class Producto {
    
    private String nombre;
    private int precio;
    private int cantidad;
    private boolean disponible=false;

    public Producto(){
    }

    public Producto(String nombre, int precio, int cantidad, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponible= disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isDisponible() {
        if(getCantidad()>0) disponible=true;
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
