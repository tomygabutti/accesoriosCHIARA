package com.chiara.db;
import com.chiara.*;
import java.sql.*;

public class DbApp {
    public static void main (String[] args){
        int idProd = 1184;
        int cantProd = 1;
        String nombreProd = "Pulsera roja";
        String detalleProd = "Pulsera roja";
        String consulta = "INSERT INTO producto (id_producto, nombre, detalle, cantidad) "
                +"VALUES ('" + idProd + "', '" + nombreProd + "', '" + detalleProd + "', '" + cantProd + "')";

        try{

        String connectionUrl = "jdbc:mysql://localhost:3306/chiara";
        Connection conn = DriverManager.getConnection(connectionUrl, "root", "Temporal.2021");

        Statement statement = conn.createStatement();



        statement.executeUpdate(consulta);

        ResultSet resultSet = statement.executeQuery("select * from producto");

        while(resultSet.next()){
            System.out.println(resultSet.getString("nombre"));
        }

    } catch (Exception e){
            e.printStackTrace();
        }
    }
}
