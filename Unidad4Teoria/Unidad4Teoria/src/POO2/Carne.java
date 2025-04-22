
package POO2;


public class Carne 
{
    private String nombre;
    private int numSocio;
    private int mesCaducidad;
    private int annoCaducidad;
    /**********************************************************************************************************************************************/
    public Carne (String nombre, int numSocio)
    {
        this.nombre=nombre;
        this.numSocio=numSocio;
    }
    /**********************************************************************************************************************************************/
    private void rellenarCaducidad()
    {
        
    }
/**********************************************************************************************************************************************/
    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
    /**********************************************************************************************************************************************/
        public void imprimirCarne()
    {
        System.out.println("*********************");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("NUMSOCIO: "+numSocio);
        System.out.println("CADUCA EL: "+mesCaducidad);
    }
/**********************************************************************************************************************************************/
    @Override
    public String toString() {
        return "Carne{" + "nombre=" + nombre + ", numSocio=" + numSocio + ", mesCaducidad=" + mesCaducidad + ", annoCaducidad=" + annoCaducidad + '}';
    }
    
}
