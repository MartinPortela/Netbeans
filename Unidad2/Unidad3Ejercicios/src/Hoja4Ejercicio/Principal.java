
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
        
        System.out.println("Introduzca número");
        num=sc.nextInt();
        
        for (int i = 1; i <= num; i++) 
        {
            posibleDivisor = 2;
        encontrado = false;
        while ((posibleDivisor < i) && (!encontrado))
        {
            if (((i % posibleDivisor) > 0)&&(posibleDivisor==i-1))
            {
                encontrado = true;
                System.out.println(i);
            }
            else
            {
                posibleDivisor++;   
            }
        }
        }
    }
}
