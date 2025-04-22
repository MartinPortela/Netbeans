
package hoja1;

import java.util.Scanner;


public class ej2 
{
    public static void main(String[] args) 
    {
        int num[]=new int[10];
        
         Scanner sc=new Scanner(System.in);
        
        System.out.print("Introduzca: ");
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();
        num[5]=sc.nextInt();
        num[6]=sc.nextInt();
        num[7]=sc.nextInt();
        num[8]=sc.nextInt();
        num[9]=sc.nextInt();
        
        mostrar(num);
    }
   
    
    private static void mostrar (int o[])
    {
        int cont=0;
        int cont2=9;
        for (int i = 0; i < o.length; i++) 
        {
            if (i%2==0)
            {
                System.out.println(o[cont]);
                cont++;
            }
            else
            {
                System.out.println(o[cont2]);
                cont2--;
            }
        }
    }
}
