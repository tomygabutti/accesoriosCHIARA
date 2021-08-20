package com.chiara;
import com.chiara.db.*;

public abstract class Producto {
    private int codigo;
    private String nombre;
    private String detalle;
    private int cantidad;

    public abstract double calcularPrecio();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Base de Datos
    public void insert(){
        ProductoDAO prodDao = new ProductoDAO();
        prodDao.insert(this.codigo,this.nombre,this.detalle,this.cantidad);
    }

    public void delete(){
        ProductoDAO prodDao = new ProductoDAO();
        prodDao.delete(this.codigo);
    }

}
