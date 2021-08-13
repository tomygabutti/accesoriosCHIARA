package com.chiara;

import com.chiara.observer.Observable;

import java.util.List;

public class Stock extends Observable {
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
