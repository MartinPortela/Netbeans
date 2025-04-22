
package hoja1;

import java.util.Scanner;


public class ej1 
{
    public static void main(String[] args) 
    {
        int num;
        
         Scanner sc=new Scanner(System.in);
         
         System.out.print("Indique el tamaño del array: ");
         num=sc.nextInt();
         int opt[]=new int[num];
         
         rellena(opt);
          
         imprmir(opt);
         
    }
    
      /*******************************************************************************************************************************************/
    private static void rellena (int ola[])
    {
        int a;
        int cont1=1;
         Scanner sc=new Scanner(System.in);
         System.out.print("Indique número: ");
         a=sc.nextInt();
        for (int i = 0; i <ola.length; i++) 
        {
            ola[i]=a*cont1;
            cont1++;
        }
    }
    /*******************************************************************************************************************************************/
    private static void imprmir (int ola[])
    {
        for (int i = 0; i < ola.length; i++) 
        {
            System.out.println(ola[i]);
        }
    }
}


