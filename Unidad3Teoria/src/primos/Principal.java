
package primos;

import java.util.Scanner;

/*
    introducir un n�mero[1..1000]
    y decir si es primo
*/

public class Principal 
{
    public static void main(String[] args) 
    {
         Scanner entrada = new Scanner(System.in);
         int numero;
         int contador = 0;
         int divisor;
         
         System.out.println("Introduce un n�mero [1..1000]");
         numero=entrada.nextInt();
         
         while ( (numero<1)|| (numero>1000000000) )
         {
            System.out.println("Introduce un n�mero [1..1000]");
            numero=entrada.nextInt();
         }
         
         //calculamos sus divisores
         divisor = 1;
         while (divisor<=numero)
         {
             if ((numero%divisor)==0)//si es divisor
             {
                 contador++;
             }
             divisor++;
         }
        if (contador>2)
            System.out.println("El n�mero "+numero+" NO ES PRIMO");
        else
            System.out.println("El n�mero "+numero+"SI ES PRIMO");
            
    }
}
