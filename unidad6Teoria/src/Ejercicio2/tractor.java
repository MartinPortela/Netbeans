
package Ejercicio2;


public class tractor extends vehiculo
{
    private String tipo;
    private String estado;

    public tractor(String tipo, String estado, int numSerie) {
        super(numSerie);
        this.tipo = tipo;
        this.estado = estado;
    }

    public tractor(String tipo, String estado, String color, int numSerie) {
        super(color, numSerie);
        this.tipo = tipo;
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void aranncar()
    {
        System.out.println("Arrancando el tractor");
    }
}
