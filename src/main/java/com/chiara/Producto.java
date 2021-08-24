package com.chiara;
import com.chiara.db.*;

public abstract class Producto {
    private int id_producto;
    private String nombre;
    private String detalle;

    public abstract double calcularPrecio();

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


}
