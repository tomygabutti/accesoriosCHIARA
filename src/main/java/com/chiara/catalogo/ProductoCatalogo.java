package com.chiara.catalogo;
import com.chiara.*;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoCatalogo {
    private Producto producto;
    private List<Foto> fotos;
    private List<Review> reviews;


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public int calicacionDeUnaEstrella(){
       if(((reviews.stream().filter(r -> r.getCalificacion() == 1).collect(Collectors.toList())).size())==1){
            return 1;
        }else{
           return 0;
       }

    }
}
