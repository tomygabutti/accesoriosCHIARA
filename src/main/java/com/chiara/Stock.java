package com.chiara;

import java.util.ArrayList;
import java.util.List;

public class Stock{
    private static Stock instancia;
    private List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void removeProducto(Producto producto){
        this.productos.remove(producto);
    }

    public static Stock getInstance(){
        if(instancia == null){
            instancia = new Stock();
        }
        return instancia;
    }

}
