
package Hoja1Ejercicio3;


public class Plano 
{
    public static void main(String[] args) 
    {
        Rectangulo rectangulos=new Rectangulo();
        Triangulo   triangulo    = new Triangulo();
        Cuadrado    cuadrado   = new Cuadrado();
        rectangulos.calcularArea();
        rectangulos.calcularPerimetro();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        System.out.println(rectangulos.toString());
        System.out.println(triangulo.toString());
        System.out.println(cuadrado.toString());
    }
}
