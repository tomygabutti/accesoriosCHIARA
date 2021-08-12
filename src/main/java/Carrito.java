import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private Cliente cliente;

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

    public void compraExitosa(){
        Double precioFinal = this.totalCompra();
        cliente.getTarjetaDeDebito().getEstado().comprar(precioFinal);
        if(precioFinal>cliente.getTarjetaDeDebito().getSaldo()){
            //ToDo
          //  cliente.getFormaDeNotificacion("Compra exitosa");
        }else{
          //  cliente.getFormaDeNotificacion("Compra rechazada");
        }
    }
}
