package com.chiara;

import java.util.List;
import java.util.stream.Collectors;

public class Administrador extends Usuario {
    private Stock stock;
    private Double precioEstadistica;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Double getPrecioEstadistica() {
        return precioEstadistica;
    }

    public void setPrecioEstadistica(Double precioEstadistica) {
        this.precioEstadistica = precioEstadistica;
    }

    public List<Producto> productosMayoresA() {
        return stock.getProductos()
                .stream()
                .filter(producto -> producto.calcularPrecio() > this.precioEstadistica)
                .collect(Collectors.toList());
    }
}
