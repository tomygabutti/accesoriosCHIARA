package com.chiara;
import com.chiara.db.*;
import com.chiara.db.ProductoDAO;
import com.chiara.db.UsuarioDAO;

import java.util.Date;

public abstract class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String tipoDocumento;
    private String nroDocumento;

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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void insert(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insert(this.nombreUsuario,this.contrasenia,this.nombre,this.apellido,this.fechaDeNacimiento,this.tipoDocumento,this.nroDocumento);
    }

    public void delete(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.delete(this.idUsuario);
    }

}
