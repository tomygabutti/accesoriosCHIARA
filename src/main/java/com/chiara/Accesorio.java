package com.chiara;
import com.chiara.db.AccesorioDAO;

public class Accesorio extends Producto {
    private int id_accesorio;
    private double precioUnitario;
    private int id_paquete;

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double calcularPrecio() {
        return precioUnitario;
    }


    public int getId_accesorio() {
        return id_accesorio;
    }

    public void setId_accesorio(int id_accesorio) {
        this.id_accesorio = id_accesorio;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public void insert(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.insert(this.id_accesorio,getNombre(),getDetalle(),calcularPrecio(),this.id_paquete);
    }

    public void delete(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.delete(this.id_accesorio);
    }

    public void select(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.delete(this.id_accesorio);
    }

}
