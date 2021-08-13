package com.chiara;

import java.util.List;

public class Paquete extends Producto{
    private List<Producto> componentes;

    public List<Producto> getComponentes() {
        return componentes;
    }

    @Override
    public double calcularPrecio() {
        return componentes.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    public void setComponentes(List<Producto> componentes) {
        this.componentes = componentes;
    }
}
