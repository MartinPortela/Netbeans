
package Hoja1Ejercicio3;


public class Triangulo extends Figura 
{
    private int base;
    private int altura;
    
    public void pedirDatos()
    {
        System.out.println("Indique la base: ");
        base=sc.nextInt();
        System.out.println("Indique la altura: ");
        altura=sc.nextInt();
    }
    public void calcularArea()
    {
        setArea(base*altura/2);
    }
    public void calcularPerimetro()
    {
        setPerimetro(base*3);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
