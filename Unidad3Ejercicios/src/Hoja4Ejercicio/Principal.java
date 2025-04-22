
package Hoja4Ejercicio;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        int num;
        int posibleDivisor;
        boolean encontrado;
        
        Scanner sc=new Scanner(System.in);
        
        do
        {
  
        System.out.println("Introduzca número");
        num=sc.nextInt();
        
        if ((num<1) || (num>1000000))
                System.out.println("Error");
        
        }while((num<1) || (num>1000000));
        
        for (int i = 1; i <= num; i++) 
        {
            posibleDivisor = 2;
        encontrado = false;
        while ((posibleDivisor < i) && (!encontrado))
        {
            if ((i % posibleDivisor) == 0)
            {
                encontrado = true;
            }
            else
            {
                posibleDivisor++;   
            }
            
        }//Fin while
        
         if ((!encontrado)&&(i !=1))
            {
                System.out.println(i);
            }
        
        }//Fin de for
        
    }//main
}//class|
