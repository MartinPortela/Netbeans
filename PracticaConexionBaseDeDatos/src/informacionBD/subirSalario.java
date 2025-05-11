
package informacionBD;
import java.sql.*;

public class subirSalario 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Cargar el driver de Oracle
            Class.forName("oracle.jdbc.OracleDriver");
            // Para NetBeans 8.0 también se puede usar:
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establecer la conexión con la base de datos
             Connection conexion = DriverManager.getConnection( 
                     "jdbc:oracle:thin:@localhost:1521:XE", "MARTIN", "martin"
            );
            // Crear la sentencia SQL
            Statement sentencia = conexion.createStatement();
            // Ejecutar la consulta y obtener el resultado, aquí podrás poner la consulta que desees
            sentencia.executeUpdate("UPDATE TEMPLE SET SALAR=SALAR+(SALAR*0.0533)");
            sentencia.executeUpdate("UPDATE TEMPLE SET COMIS=COMIS+(COMIS*0.0619) WHERE COMIS IS NOT NULL");
            // Cerrar recursos
            sentencia.close();
            conexion.close();
        } 
        catch (ClassNotFoundException cn) 
        {
            cn.printStackTrace();
        } 

        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
