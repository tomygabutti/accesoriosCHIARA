package com.chiara;
import com.chiara.db.*;
import com.chiara.db.UsuarioDAO;
import com.chiara.notificaciones.Notificacion;

public class Cliente extends Usuario {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/*
    //ToDo
    public void insert(){
        ClienteDAO clieDAO = new ClienteDAO();
        clieDAO.insert(this.idUsuario,this.);
    }

    public void delete(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.delete(this.idUsuario);
    }

 */
}
