package com.chiara;
import com.chiara.db.AccesorioDAO;
import com.chiara.db.PaqueteDAO;
import com.chiara.db.ProductoDAO;
import java.util.List;

public class Paquete extends Producto{
    private int id_paquete;
    private List<Accesorio> componentes;

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public List<Accesorio> getComponentes() {
        return componentes;
    }

    @Override
    public double calcularPrecio() {
        return componentes.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    public void setComponentes(List<Accesorio> componentes) {
        this.componentes = componentes;
    }

    public void insert(){
        PaqueteDAO paqueteDAO = new PaqueteDAO();
        for (Accesorio accesorio : componentes){
            paqueteDAO.insert(this.id_paquete,getId_producto(),accesorio.getId_accesorio());
        }
    }

    public void insertConAccesorioYProducto(){
        PaqueteDAO paqueteDAO = new PaqueteDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        for (Accesorio accesorio : componentes){
            productoDAO.insert(accesorio.getId_producto(),accesorio.getNombre(),accesorio.getDetalle(), accesorio.getCantidad());
            accesorioDAO.insert(accesorio.getId_accesorio(),accesorio.calcularPrecio(), accesorio.getId_producto());
            paqueteDAO.insert(this.id_paquete,accesorio.getId_producto(),accesorio.getId_accesorio());
        }
    }

    public void deleteConAccesorioYProducto(){
        PaqueteDAO paqueteDAO = new PaqueteDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        AccesorioDAO accesorioDAO = new AccesorioDAO();
        for (Accesorio accesorio : componentes){
            paqueteDAO.delete(this.id_paquete);
            accesorioDAO.delete(accesorio.getId_accesorio());
            productoDAO.delete(accesorio.getId_producto());
        }
    }



}
