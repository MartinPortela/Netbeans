
package EjercicioHoja1;

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        int m;
        int n;
        int num;
        int sum;
        
        num=0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame M y N");
        m=entrada.nextInt();
        n=entrada.nextInt();
        
        num=m;
        sum=0;        
        while (num<=n)
        {
            
            if (num%2==0) 
            {
             
                if (num==n-1) 
                {
                   sum=2; 
                   num=n+1;
                }
                else
                {
                    for (int j = num;  j<= n; j=j+2) 
                    {
                        sum=j+sum;
                        num=n+1;
                    }
                    
                }
            }
            else
            {
                num=num+1;
                
            }
        }
        System.out.println("La suma de los pares que comprenden estos números"
                + " es: "+sum);
    }
}
