
package triangulo;

import java.util.Scanner;

/*
programa para calcular �reas de un tri�ngulo
*/

public class Triangulo 
{

  
    public static void main(String[] args) 
    {
        int base, altura;
        double area;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA BASE: ");
        base = entrada.nextInt();
        
        System.out.println("INTRODUCE LA ALTURA: ");
        altura = entrada.nextInt();
        
        area = (base*altura)/2;
        
        System.out.println("EL �REA DEL TRI�NGULO ES = "+area);

        
    }//main()
    
}
