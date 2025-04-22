
package Ejercicio2;


public class coche extends vehiculo
{
    private int cilindrada;

    public coche(int cilindrada, int numSerie) {
        super(numSerie);
        this.cilindrada = cilindrada;
    }

    public coche(int cilindrada, String color, int numSerie) {
        super(color, numSerie);
        this.cilindrada = cilindrada;
    }
    
        @Override
    public void aranncar()
    {
        System.out.println("Arrancando el coche");
    }
    
}
