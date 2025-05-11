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

            // Establecer la conexión con la base de datos
            Connection conexion = DriverManager.getConnection(
                "jdbc:Oracle:thin:@localhost:1521:XE", "MARTIN", "martin"
            );

            // Recuperar parámetros pasados al programa
            String anno = args[0];

            // Construir sentencia SELECT con parámetros
            String sql = "SELECT AVG(ABS(TRUNC(MONTHS_BETWEEN(SYSDATE,FECIN)/12))) AS promedio_annos FROM temple WHERE numde>= ?";

            // Preparar la sentencia
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, Integer.parseInt(anno));

            // Ejecutar consulta
            ResultSet rs = sentencia.executeQuery();

            // Recorrer resultados y mostrar datos
            while (rs.next()) 
            {
                System.out.println(rs.getInt("promedio_annos"));
            }

            // Cerrar recursos
            rs.close();
            sentencia.close();
            conexion.close();

        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//Main
 }//Class