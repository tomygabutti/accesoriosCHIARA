public class Verde implements Estado {
    private TarjetaDebito tarjetaDebito;
    @Override
    public void comprar(double precioCompra) {
        double saldoActual = this.tarjetaDebito.getSaldo() - precioCompra;
        if(saldoActual>15000){
            tarjetaDebito.setSaldo(saldoActual);
        }else {
            if (saldoActual < 15000 && saldoActual > 0) {
                tarjetaDebito.setEstado(new Rojo());
                tarjetaDebito.setSaldo(saldoActual);
            } else {
                tarjetaDebito.setEstado(new Inhabilitada());
                tarjetaDebito.setSaldo(saldoActual);
            }
        }
    }
}

