package com.chiara.estados;

import com.chiara.TarjetaDebito;

public interface Estado {
    public int comprar(double precioCompra, TarjetaDebito tarjeta);
}
