package com.chiara;

public class Accesorio extends Producto {
    private double precioUnitario;

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double calcularPrecio() {
        return precioUnitario;
    }


}
