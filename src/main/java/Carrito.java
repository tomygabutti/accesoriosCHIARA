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

    public void compra(){
        Double precioFinal = this.totalCompra();
        if(cliente.getTarjetaDeDebito().getEstado().comprar(precioFinal)==1){
            //enviar Notificacion de compra exitosa TODO
           // cliente.getFormaDeNotificacion().confirmarCompra(//mensaje);
        }else{
            //enviar Notificacion de compra rechazada
            //cliente.getFormaDeNotificacion().confirmarCompra(//mensaje);
        }

    }
}
