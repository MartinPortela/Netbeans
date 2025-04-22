
package Hoja1Ejercicio3;


public class Rectangulo extends Figura
{
    private int lado1;
    private int lado2;

    public void pedirDatos()
    {
        System.out.println("Introduzca el primer lado: ");
        lado1=sc.nextInt();
        System.out.println("Introduzca el segundo lado: ");
        lado2=sc.nextInt();
    }
    public void calcularArea()
    {
        setArea(lado1*lado2);
    }
    public void calcularPerimetro()
    {
        setPerimetro((lado1*2)+(lado2*2));
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
}
