package com.chiara.db;
import com.chiara.*;
import java.sql.*;
import java.util.Date;

public class CompraDAO {
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


    public void insert(int idCompra,int idCliente,int idProd,String fecha) {
        String consulta = "INSERT INTO compra (id_compra,id_cliente,id_producto,fecha_compra) "
                + "VALUES ('" + idCompra + "','" + idCliente + "','" + idProd + "','" + fecha + "')";

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


    public boolean delete(int idCompra) {
        String consulta = "DELETE FROM compra WHERE id_compra = " + idCompra + ";";

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

    public void select(int idCompra) {
        String consulta = "select * FROM compra WHERE id_compra = " + idCompra + ";";

        try {

            this.conn = newConnection();

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){
                System.out.println(resultSet.getString("id_compra"));
                System.out.println(resultSet.getString("id_cliente"));
                System.out.println(resultSet.getString("id_producto"));
                System.out.println(resultSet.getString("fecha_compra"));

            }


        } catch (SQLException ex) {

            System.out.println("Error en select");

        }

    }

}