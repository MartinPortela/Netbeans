
package Hoja7;

import java.util.Scanner;


public class ej3
{
    public static void main(String[] args) 
    {
        int x;
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Dame valor");
         
         x=sc.nextInt();
         
         System.out.println("f(x)= "+Math.sqrt(Math.sin(Math.pow(x, 3)+((2*x)/9))+Math.cos((6*Math.PI)+Math.tan(Math.pow(Math.E, Math.pow(x, 3))))));
    }
}
