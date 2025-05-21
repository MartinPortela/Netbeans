package informacionBD;
 import java.sql.*;
 public class info 
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
            ResultSet resul = sentencia.executeQuery("SELECT ename, sal, dname,loc FROM emp, dept WHERE sal>=1400");
            // Recorrer el resultado y mostrar cada fila
            while (resul.next()) 
            {
                System.out.println(
                    resul.getString(1) + " " +
                    resul.getInt(2) + " " +
                    resul.getString(3) + " " +
                    resul.getString(4)
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
