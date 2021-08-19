package com.chiara.db;
import com.chiara.*;
import java.sql.*;

public class ProductoDAO {
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

    public void insert(int idProd,String nombreProd, String detalleProd, int cant) {
        String consulta = "INSERT INTO producto (id_producto, nombre, detalle, cantidad) "
                +"VALUES ('" + idProd + "', '" + nombreProd + "', '" + detalleProd + "', '" + cant + "')";

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

    public boolean updateActivo(int idPersona) {
        String consulta = "UPDATE persona SET activo = 0 WHERE id = " + idPersona + ";";

        try {

            this.conn = newConnection();

            // Ejecuci�n
            PreparedStatement stmt = this.conn.prepareStatement(consulta);

            // execute the preparedstatement
            stmt.executeUpdate();
            return true;


        } catch (SQLException ex) {

            // handle any errors
            System.out.println("Error en Update");
            return false;
        }

    }

    public boolean delete(int idPersona) {
        String consulta = "DELETE FROM persona WHERE id = " + idPersona + ";";

        try {

            this.conn = newConnection();

            // Ejecuci�n
            PreparedStatement stmt = this.conn.prepareStatement(consulta);

            // execute the preparedstatement
            stmt.execute();
            return true;

        } catch (SQLException ex) {

            // handle any errors
            System.out.println("Error en Delete");
            return false;
        }

    }

}

