package com.chiara.db;
import com.chiara.*;
import java.sql.*;
import java.util.Date;

public class ClienteDAO {
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


    public void insert(int idCliente,int idUsuario, String telefono, int idNotificacion) {
        String consulta = "INSERT INTO cliente (id_usuario,telefono,id_notificacion) "
                + "VALUES ('" + idUsuario + "','" + telefono + "', '" + idNotificacion + "')";

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


    public boolean delete(int idCliente) {
        String consulta = "DELETE FROM cliente WHERE id_cliente = " + idCliente + ";";

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