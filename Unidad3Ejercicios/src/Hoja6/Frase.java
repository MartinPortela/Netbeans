
package Hoja6;

import java.util.Scanner;


public class Frase 
{
    public static void main(String[] args) 
    {
        String frase;
        Scanner sc = new Scanner(System.in);
        int contador=0;
        
        System.out.print("Dime frase: ");
        frase=sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) 
        {
            
            if ((frase.charAt(i)=='a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o')||(frase.charAt(i)=='u')) 
            {
               
                
                contador++;
            }
        }
        
        System.out.println("Hay "+contador+" vocales");
    }
}
