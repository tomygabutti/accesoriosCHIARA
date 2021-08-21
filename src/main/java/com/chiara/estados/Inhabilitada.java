package com.chiara.estados;
import com.chiara.TarjetaDebito;

public class Inhabilitada implements Estado {
    @Override
    public int comprar(double precioCompra, TarjetaDebito tarjeta) {
        System.out.println("Error: Saldo insuficiente");
        return 0;
    }
}
