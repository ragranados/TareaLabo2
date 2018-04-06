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
public class FacturaCompra {
    
    private ArrayList<Producto> productosVenta;
    private int totalCompra;

    public FacturaCompra(){ 
        productosVenta = new ArrayList<>();
    }
    public void crearFactura(){        
    }

    public ArrayList<Producto> getProductosVenta() {
        return productosVenta;
    }


    public int getTotalCompra() {
        return totalCompra;
    }

    public void setProductosVenta(ArrayList<Producto> productosVenta) {
        this.productosVenta = productosVenta;
    }


    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
    
    
}
