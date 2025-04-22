
package hOJA5;

import java.util.Scanner;


public class principal 
{
    public static void main(String[] args) 
    {
        int loteria[]=new int[6];
        int numApuestas;
        int numReinteg;
        
         Scanner sc=new Scanner(System.in);
         
         System.out.println("¿Cuántas?");
         numApuestas=sc.nextInt();
         
         while(numApuestas>0)
         {
             numReinteg=(int) (Math.random()*10); 
             rellena(loteria);
             mostrar(loteria);
             System.out.print(" reintegro "+numReinteg);
             System.out.println("");
             
             numApuestas--;
         }
        
        
    }
      /*******************************************************************************************************************************************/
    private static void rellena (int o[])
    {
        for (int i = 0; i < o.length; i++) 
        {
            o[i]=(int) (Math.random()*49 + 1); 
            for (int j = 0; j < o.length; j++) 
            {
                while ((o[j]==o[i])&&(i!=j)) 
                {
                    o[i]= (int) (Math.random()*49 + 1); 
                }
                 
            }//for
           
        }//for
    }
      /*******************************************************************************************************************************************/
    private static void mostrar (int o[])
    {
        for (int i = 0; i < o.length; i++) 
        {
            System.out.print(o[i]);
            if (i!=5) 
            {
                System.out.print(", ");
            }
        }
    }
}
