
package Hoja1Ejercicio3;


public class Cuadrado extends Figura 
{
    private int lado;
    
    public void pedirDatos()
    {
        System.out.println("Introduzca el lado: ");
        lado=sc.nextInt();
    }
    public void calcularArea()
    {
        setArea(lado*lado);
    }
    public void calcularPerimetro()
    {
        setPerimetro(lado*4);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }


    
    
}
