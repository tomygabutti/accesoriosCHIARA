public class Inhabilitada implements Estado {
    @Override
    public void comprar(double precioCompra) {
        System.out.println("Error: Saldo insuficiente");
    }
}
