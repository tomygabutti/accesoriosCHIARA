package com.chiara.estados;

public class Inhabilitada implements Estado {
    @Override
    public int comprar(double precioCompra) {
        System.out.println("Error: Saldo insuficiente");
        return 0;
    }
}
