
package bocatas;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        double  total;
        int     numero;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("�Cu�ntos bocadillos quiere?");
        numero = entrada.nextInt();
        total=(numero*3.5);
        
        System.out.println("�Cu�ntos refrescos quiere?");
        numero = entrada.nextInt();
        total=total+(numero*2.25);
        
        System.out.println("�Cu�ntas cervezas quiere?");
        numero = entrada.nextInt();
        total=total+(numero*2.75);
        
        System.out.println("El precio es: "+total);
    }
    
}
