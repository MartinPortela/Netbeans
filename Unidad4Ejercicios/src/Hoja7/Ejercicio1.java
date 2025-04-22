
package Hoja7;

import java.util.Scanner;


public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        int numeros [][]=new int [5][5];
        
        int numeroUsuario;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Indique el número del 1 al 10: ");
        numeroUsuario=sc.nextInt();
        
         for (int i = 0; i < numeros.length; i++) 
        {
                for (int j = 0; j < numeros.length; j++) 
            {
            numeros[i][j] = (int)((Math.random()*10) + 1); 
             }
                
        }//for
         
         System.out.println(ocurrencias(numeroUsuario, numeros));
         
    }
    
    private static int ocurrencias(int numeroUsuario, int numeros[][])
    {
        int cont=0;
        
        for (int i = 0; i < numeros.length; i++) 
        {
                for (int j = 0; j < numeros.length; j++) 
            {
                if (numeros[i][j]==numeroUsuario)
                {
                    numeros[i][j]=-1;
                    cont++;
                }
                
             }
        }
        return cont;
}
}
