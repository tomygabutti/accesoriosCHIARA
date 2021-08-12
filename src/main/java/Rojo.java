public class Rojo implements Estado {
    private TarjetaDebito tarjetaDebito;
    @Override
    public void comprar(double precioCompra) {
        double saldoActual = this.tarjetaDebito.getSaldo() - precioCompra;
        if(saldoActual<15000 && saldoActual>0){
            tarjetaDebito.setSaldo(saldoActual);
        }else{
            tarjetaDebito.setSaldo(saldoActual);
            tarjetaDebito.setEstado(new Inhabilitada());
        }
    }
}
