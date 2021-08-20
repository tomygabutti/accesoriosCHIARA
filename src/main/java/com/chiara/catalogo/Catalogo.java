package com.chiara.catalogo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private static Catalogo instancia;
    private List<ProductoCatalogo> productos = new ArrayList<>();

    public List<ProductoCatalogo> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoCatalogo> productos) {
        this.productos = productos;
    }

    public void addProducto(ProductoCatalogo producto) {
        this.productos.add(producto);
    }

    public void removeProducto(ProductoCatalogo producto){
        this.productos.remove(producto);
    }

    public static Catalogo getInstance(){
        if(instancia == null){
            instancia = new Catalogo();
        }
        return instancia;
    }

}
