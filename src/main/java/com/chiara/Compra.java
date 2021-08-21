package com.chiara;

import com.chiara.db.AdministradorDAO;
import com.chiara.db.CompraDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Compra {
    private int codigoCompra;
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private String fechaCompra;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public Double totalCompra(){
        return productos.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    public String comprobanteCompra(){
        String productosToString = this.productos.stream().map(producto -> producto.getNombre()+" "+producto.calcularPrecio()).collect(Collectors.joining(", "));;
        String totalCompra = totalCompra().toString();

        return "lista de Productos: "+productosToString+"\n"+"Precio Final: "+totalCompra;
    }

    public void compraGeneral(){
        Double precioFinal = this.totalCompra();
        String numeroCliente = cliente.getTelefono();
        if((this.cliente.getTarjetaDeDebito().getEstado().comprar(precioFinal,this.cliente.getTarjetaDeDebito()))==1){
            String comprobanteCompra = comprobanteCompra();
            cliente.getFormaDeNotificacion().comprobanteCompra(comprobanteCompra,numeroCliente);
        }else{
            String compraRechazada = "Compra rechazada";
            cliente.getFormaDeNotificacion().comprobanteCompra(compraRechazada,numeroCliente);
        }
    }

    public void insert(){
        CompraDAO compraDAO = new CompraDAO();
        for (Producto prod : productos){
             compraDAO.insert(this.codigoCompra,this.cliente.getId_cliente(),prod.getCodigo(),this.fechaCompra);
        }
    }

    public void delete(){
        CompraDAO compraDAO = new CompraDAO();
        compraDAO.delete(this.codigoCompra);
    }

    public void select(){
        CompraDAO compraDAO = new CompraDAO();
        compraDAO.select(this.codigoCompra);
    }

}
