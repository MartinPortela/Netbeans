
package Ejercicio2;


public class vehiculo 
{
    private String color;
    private int numSerie;
    
    public vehiculo(int numSerie) {
        this.numSerie = numSerie;
        color="blanco";
    }

    public vehiculo(String color, int numSerie) {
        this.color = color;
        this.numSerie = numSerie;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    
    public void aranncar()
    {
        System.out.println("Arrancando el vehiculo");
    }
    
}
