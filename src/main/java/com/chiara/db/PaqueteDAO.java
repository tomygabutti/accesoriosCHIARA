package com.chiara.db;
import com.chiara.*;
import java.sql.*;
import java.util.Date;

public class PaqueteDAO {
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


    public void insert(int codigo,int idProd,int idAcce) {
        String consulta = "INSERT INTO paquete (cod_paquete,id_producto,id_accesorio) "
                + "VALUES ('" + codigo + "','" + idProd + "','" + idAcce + "')";

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


    public boolean delete(int codigo) {
        String consulta = "DELETE FROM paquete WHERE cod_paquete = " + codigo + ";";

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

    public void select(int codigo) {
        String consulta = "select * FROM paquete WHERE cod_paquete = " + codigo + ";";

        try {

            this.conn = newConnection();

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){
                System.out.println(resultSet.getString("cod_paquete"));
                System.out.println(resultSet.getString("id_producto"));
                System.out.println(resultSet.getString("id_accesorio"));

            }


        } catch (SQLException ex) {

            System.out.println("Error en SELECT");

        }

    }

}