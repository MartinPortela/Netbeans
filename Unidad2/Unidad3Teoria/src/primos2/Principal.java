
package primos2;

// Un poco más óptimo

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) 
    {
        // si nos fijamos bastará encontrar un solo divisor (aparte de él 
        // mismo y la unidad) para saber que NO es primo
        
        int numero=0;
        int posibleDivisor;
        boolean encontrado;
        
        Scanner entrada = new Scanner(System.in);
        
        while ( (numero <=0) || (numero > 1000000000) )
        {
            System.out.print("Introduce un número en el rango [1..1000]: ");
            numero = entrada.nextInt();
        }
        
        posibleDivisor = 2;
        encontrado = false;
        while ((posibleDivisor < numero) && (!encontrado))
        {
            if ((numero % posibleDivisor) == 0)
                encontrado = true;
            else
                posibleDivisor++;    
        }
        if (encontrado || (numero == 1))
            System.out.println("El número " + numero + " NO ES PRIMO");
        else
            System.out.println("El nímero " + numero + " SÍ ES PRIMO");
        
    }//main()
    
    
}//class
