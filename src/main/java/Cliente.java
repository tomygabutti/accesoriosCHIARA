import Notificaciones.Notificacion;

public class Cliente extends Persona {
    private String telefono;
    private Notificacion formaDeNotificacion;
    private TarjetaDebito tarjetaDeDebito;

    public Notificacion getFormaDeNotificacion() {
        return formaDeNotificacion;
    }

    public void setFormaDeNotificacion(Notificacion formaDeNotificacion) {
        this.formaDeNotificacion = formaDeNotificacion;
    }

    public TarjetaDebito getTarjetaDeDebito() {
        return tarjetaDeDebito;
    }

    public void setTarjetaDeDebito(TarjetaDebito tarjetaDeDebito) {
        this.tarjetaDeDebito = tarjetaDeDebito;
    }
}
