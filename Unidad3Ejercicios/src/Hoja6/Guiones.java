
package Hoja6;

import java.util.Scanner;


public class Guiones
{
    public static void main(String[] args) 
    {
        String palabra;
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduce una palabra: ");
        palabra=sc.nextLine();
        palabra=palabra.toLowerCase();
        
        for (int i = 0; i < palabra.length()-1; i++) 
        {
            System.out.print((palabra.charAt(i))+"-");
        }
        System.out.print(palabra.charAt(palabra.length()-1));
        System.out.println("");
      
    }//main
   
}//class
