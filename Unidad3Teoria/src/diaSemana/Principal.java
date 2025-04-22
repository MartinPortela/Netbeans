
package diaSemana;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        int diaSemana;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el día de la semana");
        diaSemana=entrada.nextInt();
        
        switch (diaSemana) 
        {
            case 1:
                System.out.println("Comienza la semana");
                break;
                
            case 2,3,4:
                System.out.println("mediados de semana");
                break;
                
            case 5:
                System.out.println("se acerca el finde");
                break;
                
            case 6:
                System.out.println("el mejor día");
                break;
                
            case 7:
                System.out.println("mañana otra vez programación");
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
    
}
