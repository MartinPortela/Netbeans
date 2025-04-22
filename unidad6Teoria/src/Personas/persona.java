
package Personas;


public class persona 
{
    private String nombre;
    private String apellidos;

    public persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void caminar()
    {
        System.out.println("CAMINANDO...................");
    }
    
    public void dormir()
    {
        System.out.println("DURMIENDO...................");
    }
    
    public void visualizarInfo()
    {
        System.out.println("NOMBRE: "+nombre+" APPELIDOS: "+apellidos);
    }


}
