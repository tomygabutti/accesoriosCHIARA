package com.chiara.db;
import java.sql.*;

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


    public void insert(int idCliente,String nombreUsuario,String contrasenia,String nombre,String apellido,String telefono,String fechaNac) {
        String consulta = "INSERT INTO cliente (id_cliente,nombre_usuario,contrasenia,nombre,apellido,telefono,fecha_nacimiento) "
                + "VALUES ('" + idCliente + "','" + nombreUsuario + "','" + contrasenia + "', '" + nombre + "', '" + apellido + "', '" + telefono + "', '" + fechaNac + "')";

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

    public void select(int idCliente) {
        String consulta = "select * FROM cliente WHERE id_cliente = " + idCliente + ";";

        try {

            this.conn = newConnection();

            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){
                System.out.println(resultSet.getString("id_cliente"));
                System.out.println(resultSet.getString("nombre_usuario"));
                System.out.println(resultSet.getString("contrasenia"));
                System.out.println(resultSet.getString("nombre"));
                System.out.println(resultSet.getString("apellido"));
                System.out.println(resultSet.getString("telefono"));
                System.out.println(resultSet.getString("fecha_nacimiento"));
            }


        } catch (SQLException ex) {

            System.out.println("Error en SELECT");

        }

    }

}