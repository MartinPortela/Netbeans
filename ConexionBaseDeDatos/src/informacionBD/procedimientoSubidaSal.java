package informacionBD;

import java.sql.*;


public class procedimientoSubidaSal 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Cargar el driver de Oracle
            Class.forName("oracle.jdbc.OracleDriver");

            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(
                "jdbc:Oracle:thin:@localhost:1521:XE", "MARTIN", "martin"
            );

            // Recuperar parámetros del main
            String dep = args[0];     // Departamento
            String subida = args[1];  // Subida

            // Construir la orden de llamada al procedimiento almacenado
            String sql = "{ call subida_sal (?, ?) }";

            // Preparar la llamada
            CallableStatement llamada = conexion.prepareCall(sql);

            // Asignar valores a los parámetros
            llamada.setInt(1, Integer.parseInt(dep));        // Primer argumento - deptno
            llamada.setFloat(2, Float.parseFloat(subida));   // Segundo argumento - subida

            // Ejecutar el procedimiento
            llamada.executeUpdate();
            System.out.println("Subida realizada ......");

            // Cerrar recursos
            llamada.close();
            conexion.close();

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}