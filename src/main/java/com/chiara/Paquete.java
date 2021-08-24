package com.chiara;
import com.chiara.db.AccesorioDAO;
import com.chiara.db.PaqueteDAO;

import java.util.List;

public class Paquete extends Producto{
    private int id_paquete;
    private List<Producto> componentes;
    private int id_paquete_padre;

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

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

    public int getId_paquete_padre() {
        return id_paquete_padre;
    }

    public void setId_paquete_padre(int id_paquete_padre) {
        this.id_paquete_padre = id_paquete_padre;
    }

    public void insert(){
        PaqueteDAO paqueteDAO = new PaqueteDAO();
        for(Producto prod : componentes){
            paqueteDAO.insert(this.id_paquete,prod.getId_producto(),this.getId_paquete_padre());
        }
    }

    public void delete(){
        PaqueteDAO paqueteDAO = new PaqueteDAO();
        paqueteDAO.delete(this.id_paquete);
    }

}
