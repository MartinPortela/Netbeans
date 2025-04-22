
package primos2;

// Un poco m�s �ptimo

import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) 
    {
        // si nos fijamos bastar� encontrar un solo divisor (aparte de �l 
        // mismo y la unidad) para saber que NO es primo
        
        int numero=0;
        int posibleDivisor;
        boolean encontrado;
        
        Scanner entrada = new Scanner(System.in);
        
        while ( (numero <=0) || (numero > 1000000000) )
        {
            System.out.print("Introduce un n�mero en el rango [1..1000]: ");
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
            System.out.println("El n�mero " + numero + " NO ES PRIMO");
        else
            System.out.println("El n�mero " + numero + " S� ES PRIMO");
        
    }//main()
    
    
}//class
