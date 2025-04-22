
package POO2;


public class Socio 
{
    private String nombre;
    private int numSocio;
    private Carne carne;
    /**********************************************************************************************************************************************/
    public Socio(String nombre, int numSocio)
    {
        this.nombre=nombre;
        this.numSocio=numSocio;
        
        carne=new Carne(nombre, numSocio);
    }
/**********************************************************************************************************************************************/
    public String getNombre() {
        return nombre;
    }
/**********************************************************************************************************************************************/
    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

/**********************************************************************************************************************************************/
    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", numSocio=" + numSocio + ", carne=" + carne + '}';
    }
    
}
