
package practicaAdicional;

import java.util.Arrays;
import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        int num1 []=new int [10];
        int num2 []=new int [10];
        String pelicula []=new String [3];
        String palabras [];
        
        inicializarNum1(num1);
        pintarArray(num1);
        creaOrdenado(num1, num2);
        pedirPelis(pelicula);
        todasLasPalabras(pelicula);
        buscaRepetidos(num2, 22);
        vecesDel20(num2);
    }
    /*******************************************************************************************************************************************/
    public static void inicializarNum1(int num1[])
    {
        for (int i = 0; i < num1.length; i++) 
        {
            num1[i]=(int)(Math.random()*(25-20+1)+20);
        }
    }
    /*******************************************************************************************************************************************/
    public static void pintarArray(int num1[])
    {
        for (int i = 0; i < num1.length; i++) 
        {
            System.out.println(num1[i]);
        }
    }
     /*******************************************************************************************************************************************/
   public static void creaOrdenado(int num1[], int num2[])
   {
       for (int i = 0; i < num1.length; i++) 
       {
           num2[i]=num1[i];
       }
       
       Arrays.sort(num2);
   }
    /*******************************************************************************************************************************************/
   private static void pedirPelis(String peliculas[])
   {
       Scanner sc=new Scanner(System.in);
    
       for (int i = 0; i < 3; i++) 
       {
           System.out.println("Indique la película: ");
           peliculas[i]=sc.nextLine();
       }
      
   }
    /*******************************************************************************************************************************************/
   private static void todasLasPalabras(String peliculas[])
   {
       String palabrasPeli[];
       for (int i = 0; i < peliculas.length; i++) 
       {
           palabrasPeli=peliculas[i].split(" ");
           
           for (int j = 0; j < palabrasPeli.length; j++) 
           {
               System.out.println(palabrasPeli[j]);
           }
       }
   }
     /*******************************************************************************************************************************************/
   private static void buscaRepetidos(int num2[], int b)
   {
       for (int i = 0; i < num2.length; i++) 
       {
           if (num2[i]==b) 
           {
               System.out.print("La posición es: "+i);
               System.out.println(" ");
           }
       }
   }
     /*******************************************************************************************************************************************/
   private static void vecesDel20(int num2[])
   {
       int cont=0;
              for (int i = 0; i < num2.length; i++) 
       {
           if (num2[i]==20) 
           {
               cont++;
           }
       }
              System.out.println(cont);
   }
}
