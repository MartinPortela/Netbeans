
package Practica1;

import java.util.Scanner;


public class puntos 
{
    public static void main(String[] args) 
    {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte número");
        num=sc.nextInt();
        
        
        //If-else para cumplir la condición de N
        
        if ((num<1) || (num>10)) 
        {
            System.out.println("Error");
        }
        else
        {
            //For para las repeticiones de los puntos
            for (int i = 1; i <= num; i++) 
            {
                //If para escribir las filas
                if ((i==1)||(i==num)) 
                {
                    for (int j = 0; j < num; j++) 
                    {
                        System.out.print("*"); 
                        
                    }
                }
                //Else para las columnas
                else 
                {
                    for (int j = 0; j < num; j++) 
                    {
                        if ((j==0)||(j==(num-1)))
                        {
                        
                        System.out.print("*"); 
                        
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    
                }
                //Me cambia de línea
              System.out.println(" ");  
            }
 
        }
    }
}
