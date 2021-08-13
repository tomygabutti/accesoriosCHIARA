public class Verde implements Estado {
    private TarjetaDebito tarjetaDebito;
    @Override
    public int comprar(double precioCompra) {
        double saldoActual = this.tarjetaDebito.getSaldo() - precioCompra;
        if(saldoActual>15000){
            tarjetaDebito.setSaldo(saldoActual);
            return 1;
        }else {
            if (saldoActual < 15000 && saldoActual > 0) {
                tarjetaDebito.setEstado(new Rojo());
                tarjetaDebito.setSaldo(saldoActual);
                return 1;
            } else {
                tarjetaDebito.setEstado(new Inhabilitada());
                System.out.println("Error: Saldo insuficiente");
                return 0;
            }
        }
    }
}

