package com.chiara.estados;
import com.chiara.TarjetaDebito;

public class Rojo implements Estado {

    @Override
    public int comprar(double precioCompra, TarjetaDebito tarjeta) {
        double saldoActual = tarjeta.getSaldo() - precioCompra;
        if(saldoActual<15000 && saldoActual>50){
            tarjeta.setSaldo(saldoActual);
            return 1;
        }else{
            tarjeta.setEstado(new Inhabilitada());
            System.out.println("Error: Saldo insuficiente");
            return 0;
        }
    }
}
