package informacionBD;

import java.sql.*;

public class insertDepart 
{
     public static void main(String[] args) 
     {
        try 
        {
            // Cargar el driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(
                "jdbc:Oracle:thin:@localhost:1521:XE", "MARTIN", "martin"
            );

            // Recuperar parámetros de main
            String deptno = args[0];
            String dname = args[1];
            String loc = args[2];

            // Construir orden INSERT
            String sql = "INSERT INTO dept VALUES (?, ?, ?)";
            System.out.println(sql);

            // Preparar la sentencia
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, Integer.parseInt(deptno));
            sentencia.setString(2, dname);
            sentencia.setString(3, loc);

            // Ejecutar sentencia
            int filas = sentencia.executeUpdate();
            System.out.println("Filas afectadas: " + filas);

            // Cerrar recursos
            sentencia.close();
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}