package com.chiara.db;
import com.chiara.*;
import java.sql.*;
import java.util.Date;

public class AdministradorDAO {
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


    public void insert(int idAdmin,String nombreUsuario,String contrasenia) {
        String consulta = "INSERT INTO administrador (id_administrador,nombre_usuario,contrasenia) "
                + "VALUES ('" + idAdmin + "','" + nombreUsuario + "','" + contrasenia + "')";

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


    public boolean delete(int idAdmin) {
        String consulta = "DELETE FROM administrador WHERE id_administrador = " + idAdmin + ";";

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

    public void select(int idAdmin) {
        String consulta = "select * FROM administrador WHERE id_administrador = " + idAdmin + ";";

        try {

            this.conn = newConnection();

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){
                System.out.println(resultSet.getString("id_administrador"));
                System.out.println(resultSet.getString("nombre_usuario"));
                System.out.println(resultSet.getString("contrasenia"));

            }


        } catch (SQLException ex) {

            System.out.println("Error en Delete");

        }

    }

}