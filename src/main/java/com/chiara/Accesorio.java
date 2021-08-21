package com.chiara;
import com.chiara.db.AccesorioDAO;
import com.chiara.db.ProductoDAO;

public class Accesorio extends Producto {
    private int id_accesorio;
    private double precioUnitario;

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

    public void insert(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.insert(this.id_accesorio,this.precioUnitario,getId_producto());
    }

    public void insertConProducto(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        productoDAO.insert(getId_producto(),getNombre(),getDetalle(),getCantidad());
        accesorioDAO.insert(this.id_accesorio,this.precioUnitario,getId_producto());
    }

    public void delete(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.delete(this.id_accesorio);
    }

    public void deleteConProducto(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        accesorioDAO.delete(this.id_accesorio);
        productoDAO.delete(getId_producto());
    }

    public void select(){
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        accesorioDAO.delete(this.id_accesorio);
    }

}
