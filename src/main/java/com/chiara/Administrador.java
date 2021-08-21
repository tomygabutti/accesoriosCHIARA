package com.chiara;

import com.chiara.catalogo.Catalogo;
import com.chiara.catalogo.ProductoCatalogo;
import com.chiara.db.AdministradorDAO;
import com.chiara.db.ClienteDAO;

import java.util.List;
import java.util.stream.Collectors;

public class Administrador{
    private int id_administrador;
    private String nombreUsuario;
    private String contrasenia;
    private Catalogo catalogo;

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
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

    public List<ProductoCatalogo> productosAlMenosUnaEstrella() {
        return catalogo.getProductos().stream().filter(ProductoCatalogo::calicacionDeUnaEstrella).collect(Collectors.toList());
    }

    public void insert(){
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.insert(this.id_administrador,this.nombreUsuario,this.contrasenia);
    }

    public void delete(){
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.delete(this.id_administrador);
    }

    public void select(){
        AdministradorDAO administradorDAO = new AdministradorDAO();
        administradorDAO.select(this.id_administrador);
    }

}
