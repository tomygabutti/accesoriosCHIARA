package com.chiara.catalogo;

public class Foto {
    private String tamanio;
    private String calidad;
    private FormatoImagen formato;

    public void normalizar(String tamanioEstandar) {
        this.tamanio = tamanioEstandar;
    }

    // Getters Setters

    public String getTamanio() { return tamanio; }

    public void setTamanio(String tamanio) { this.tamanio = tamanio; }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public FormatoImagen getFormato() {
        return formato;
    }

    public void setFormato(FormatoImagen formato) {
        this.formato = formato;
    }
}