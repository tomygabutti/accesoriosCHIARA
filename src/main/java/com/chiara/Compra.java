package com.chiara;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Compra {
    private String codigoCompra;
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private Date fechaCompra;

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

    public Double totalCompra(){
        return productos.stream().mapToDouble(Producto::calcularPrecio).sum();
    }

    public String comprobanteCompra(){
        String productosToString = this.productos.stream().map(producto -> producto.getNombre()+" "+producto.calcularPrecio()).collect(Collectors.joining(", "));;
        String totalCompra = totalCompra().toString();

        return "lista de Productos: "+productosToString+"\n"+"Precio Final: "+totalCompra;
    }

    public void compra(){
        Double precioFinal = this.totalCompra();
        String numeroCliente = cliente.getTelefono();
        if(cliente.getTarjetaDeDebito().getEstado().comprar(precioFinal)==1){
            String comprobanteCompra = comprobanteCompra();
            cliente.getFormaDeNotificacion().comprobanteCompra(comprobanteCompra,numeroCliente);
        }else{
            String compraRechazada = "Compra rechazada";
            cliente.getFormaDeNotificacion().comprobanteCompra(compraRechazada,numeroCliente);
        }

    }
}
