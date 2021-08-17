package com.chiara.estados;

import com.chiara.TarjetaDebito;

public class Verde implements Estado {

    @Override
    public int comprar(double precioCompra, TarjetaDebito tarjeta) {
        double saldoActual = tarjeta.getSaldo() - precioCompra;
        if (saldoActual > 15000) {
            tarjeta.setSaldo(saldoActual);
            return 1;
        } else {
            if (saldoActual < 15000 && saldoActual > 50) {
                tarjeta.setEstado(new Rojo());
                tarjeta.setSaldo(saldoActual);
                return 1;
            } else {
                    tarjeta.setEstado(new Inhabilitada());
                    System.out.println("Compra rechazada, saldo insuficiente");
                    return 0;

                }
            }
        }
    }

