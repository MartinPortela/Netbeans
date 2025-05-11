package informacionBD;

import java.sql.*;


public class verEmpleados 
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

            // Recuperar parámetros pasados al programa
            String dept = args[0];   // Departamento
            String oficio = args[1]; // Oficio

            // Construir sentencia SELECT con parámetros
            String sql = "SELECT ENAME, SAL FROM emp " +
                         "WHERE deptno = ? AND JOB = ? ORDER BY 1";

            // Preparar la sentencia
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, Integer.parseInt(dept));
            sentencia.setString(2, oficio);

            // Ejecutar consulta
            ResultSet rs = sentencia.executeQuery();

            // Recorrer resultados y mostrar datos
            while (rs.next()) 
            {
                System.out.println(rs.getString("ENAME") + " => " + rs.getFloat("SAL"));
            }

            // Cerrar recursos
            rs.close();
            sentencia.close();
            conexion.close();

        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

}//fin de la clase