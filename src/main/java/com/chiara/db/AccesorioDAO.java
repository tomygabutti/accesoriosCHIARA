package com.chiara.db;
import java.sql.*;

public class AccesorioDAO {
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


    public void insert(int idAcce,String nombre,String detalle,double precio,int idPaquete) {
        String consulta = "INSERT INTO accesorio (id_accesorio,nombre,detalle,precio_unitario,id_paquete) "
                + "VALUES ('" + idAcce + "','" + nombre + "','" + detalle + "','" + precio + "','" + idPaquete + "')";

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


    public boolean delete(int idAcce) {
        String consulta = "DELETE FROM accesorio WHERE id_accesorio = " + idAcce + ";";

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

    public void select(int idAcce) {
        String consulta = "select * FROM accesorio WHERE id_accesorio = " + idAcce + ";";

        try {

            this.conn = newConnection();

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){
                System.out.println(resultSet.getString("id_accesorio"));
                System.out.println(resultSet.getString("precio_unitario"));
                System.out.println(resultSet.getString("id_producto"));

            }


        } catch (SQLException ex) {

            System.out.println("Error en SELECT");

        }

    }

}