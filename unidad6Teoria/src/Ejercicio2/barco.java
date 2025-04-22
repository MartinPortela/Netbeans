
package Ejercicio2;


public class barco extends vehiculo
{

    public barco(int numSerie) {
        super(numSerie);
    }

    public barco(String color, int numSerie) {
        super(color, numSerie);
    }
    
        @Override
    public void aranncar()
    {
        System.out.println("Arrancando el barco");
    }
}
