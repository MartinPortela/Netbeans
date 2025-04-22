
package estudioscanner;

import java.util.Scanner;

/*
 estudiamos la clase Scanner
 con ejemplos
*/


public class EstudioScanner 
{

    
    public static void main(String[] args) 
    {
        int edad;
        double peso;
        String nombre;
        String curso;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame tu nombre: ");
        nombre=entrada.nextLine();
        
        System.out.println("Dame tu edad: ");
        edad=entrada.nextInt();
        
        System.out.println("Dame tu peso: ");
        peso=entrada.nextDouble();
        
        entrada.nextLine();
        System.out.println("Dime tu curso: ");
        curso=entrada.nextLine();
        
        System.out.println("NOMBRE: "+nombre+" EDAD: "+edad+" PESO: "+peso);
       
    }
    
}
