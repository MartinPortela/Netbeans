
package numeroAlReves;

//visualizar números de 4 cifras al revés

import java.util.Scanner;


public class Principal 
{
     public static void main(String[] args) 
    {
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INTRODUCE UN NÚMERO DE 4 CIFRAS: ");
        numero = entrada.nextInt();
        
       while ((numero <= 999) || (numero >9999))
       {
        System.out.println("INTRODUCE UN NÚMERO DE 4 CIFRAS: ");
        numero = entrada.nextInt();
       }
        
       while (numero>0)
       {
           System.out.print(numero % 10 + " ");
           numero = numero / 10;
           
           
       }
        
        
    }//main()
}//class
