/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;

import java.util.ArrayList;
/**
 *
 * @author rau3
 */
public class Inventario {
    private ArrayList<FacturaCompra> facturasCompras;
    private ArrayList<Producto> productoDisponible;

    public Inventario() {
    }

    public ArrayList<FacturaCompra> getFacturasCompras() {
        return facturasCompras;
    }

    public ArrayList<Producto> getProductoDisponible() {
        return productoDisponible;
    }

    public void setFacturasCompras(ArrayList<FacturaCompra> facturasCompras) {
        this.facturasCompras = facturasCompras;
    }

    public void setProductoDisponible(ArrayList<Producto> productoDisponible) {
        this.productoDisponible = productoDisponible;
    }
    public static void main(String[] args) {
       // Administrador admin = getInstance();
        
    }
    
}
