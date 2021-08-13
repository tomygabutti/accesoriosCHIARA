package com.chiara.observer;

import com.chiara.*;
import com.chiara.observer.*;

public class CantidadProductosRestantes implements Observer {

    private int productosRestantes;

    public int getProductosRestantes() {
        return productosRestantes;
    }

    public void setProductosRestantes(int productosRestantes) {
        this.productosRestantes = productosRestantes;
    }


    @Override
    public void update(Observable observable){
        this.productosRestantes = ((Stock)observable).getProductos().size();}

}

