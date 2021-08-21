package com.chiara;
import com.chiara.db.ClienteDAO;
import com.chiara.notificaciones.Notificacion;

public class Cliente{
    private int id_cliente;
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String telefono;
    private String fechaNac;
    private Notificacion formaDeNotificacion;
    private TarjetaDebito tarjetaDeDebito;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void insert(){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.insert(this.id_cliente,this.nombreUsuario,this.contrasenia,this.nombre,this.apellido,this.telefono,this.fechaNac);
    }

    public void delete(){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.delete(this.id_cliente);
    }

    public void select(){
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.select(this.id_cliente);
    }
}

