package com.chiara.db;
import com.chiara.*;
import java.sql.*;
import java.util.Date;

public class UsuarioDAO {
    Connection conn;

    public Connection newConnection() {
        try {

            String connectionUrl = "jdbc:mysql://localhost:3306/chiara";
            Connection conn = DriverManager.getConnection(connectionUrl, "root", "Temporal.2021");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void insert(String nombreUsuario, String contrasenia, String nombre, String apellido, String fechaNac, String tipoDoc, String nroDoc) {
        String consulta = "INSERT INTO usuario (nombre_usuario,contrasenia,nombre,apellido,fecha_nacimiento,tipo_documento,nro_documento) "
                + "VALUES ('" + nombreUsuario + "','" + contrasenia + "', '" + nombre + "', '" + apellido + "', '" + fechaNac + "', '" + tipoDoc + "','" + nroDoc + "')";

        try {
            this.conn = newConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(consulta);

        } catch (SQLException ex) {

            System.out.println("Error en Insert");
            System.out.println(ex.getErrorCode());
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());

        }

    }


    public boolean delete(int idUsuario) {
        String consulta = "DELETE FROM usuario WHERE id_usuario = " + idUsuario + ";";

        try {

            this.conn = newConnection();

            PreparedStatement stmt = this.conn.prepareStatement(consulta);

            stmt.execute();
            return true;

        } catch (SQLException ex) {

            System.out.println("Error en Delete");
            return false;
        }

    }
}