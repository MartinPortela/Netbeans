
package informacionBD;
 import java.sql.*;

public class procedimientoMostrar 
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
            String empleado = args[0];     // Departamento

            // Construir la orden de llamada al procedimiento almacenado
            String sql = "{ call mostrar_empleados (?) }";

            // Preparar la llamada
            CallableStatement llamada = conexion.prepareCall(sql);

            // Asignar valores a los parámetros
            llamada.setInt(1, Integer.parseInt(empleado));        // Primer argumento - deptno

            // Ejecutar el procedimiento
            llamada.executeUpdate();

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
