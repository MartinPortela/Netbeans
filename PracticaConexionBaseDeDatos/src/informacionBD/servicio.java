package informacionBD;
 import java.sql.*;
 public class servicio
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
            ResultSet resul = sentencia.executeQuery("SELECT AVG(ABS(TRUNC(MONTHS_BETWEEN(SYSDATE,FECIN)/12))) FROM temple WHERE numde>= ?");
            // Recorrer el resultado y mostrar cada fila
            while (resul.next()) 
            {
                System.out.println(
                    resul.getInt(1)
                );
            }
            // Cerrar recursos
            resul.close();
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
    }//Main
 }//Class