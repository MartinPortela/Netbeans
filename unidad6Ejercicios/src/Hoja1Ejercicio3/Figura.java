
package Hoja1Ejercicio3;

import java.util.Scanner;


public class Figura 
{
    private int area;
    private int perimetro;
    Scanner sc=new Scanner(System.in);

    public Figura() 
    {
        pedirDatos();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    public void pedirDatos()
    {
        
    }
    public void calcularArea()
    {
        
    }
    public void calcularPerimetro()
    {
        
    }

    @Override
    public String toString() {
        return "Figura{" + "area=" + area + ", perimetro=" + perimetro + ", sc=" + sc + '}';
    }
    
    
}
