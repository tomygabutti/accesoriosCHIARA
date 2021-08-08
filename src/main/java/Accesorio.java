public class Accesorio extends Producto{
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    private double precioUnitario;

    @Override
    public double calcularPrecio() {
        return precioUnitario;
    }


}
