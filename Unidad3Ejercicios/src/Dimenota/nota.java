
package Dimenota;

import java.util.Scanner;


public class nota 
{
    public static void main(String[] args) 
    {
        int notas;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Dime nota: ");
        notas = entrada.nextInt();
        
        switch (notas) 
        {
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;   
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("MH");
                break;
            default:
                System.out.println("Error");
                
        }
    }
}
