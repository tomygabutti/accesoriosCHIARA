package com.chiara;

import com.chiara.catalogo.Catalogo;
import com.chiara.catalogo.ProductoCatalogo;

import java.util.List;
import java.util.stream.Collectors;

public class Administrador extends Usuario {
    private Catalogo catalogo;

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public List<ProductoCatalogo> productosAlMenosUnaEstrella() {
        return catalogo.getProductos().stream().filter(p -> p.calicacionDeUnaEstrella()==1).collect(Collectors.toList());
    }
}
