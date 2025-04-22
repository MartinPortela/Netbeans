
package clasico;

import java.util.Scanner;


public class ejercicioClasico 
{
    public static void main(String[] args) 
    {
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Diga número: ");
        numero = entrada.nextInt();
        
        if ((numero>=1) && (numero<=1000))  
        {
            if ((numero%2==0) || (numero%3==0) || (numero%7==0) || 
                    (numero%5==0))
            {
                System.out.println("No es primo");
            } else 
            {
                System.out.println("Es primo");
            }
        
        } else
        {
            System.out.println("Dato no válido");
        }
}
