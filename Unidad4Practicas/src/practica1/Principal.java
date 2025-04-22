
package practica1;

import java.util.Scanner;


 
public class Principal 
{
    
    public static void main(String[] args) 
    {
        int num=0;
        
        int num2;
        
        int cont=0;
        
        Scanner sc=new Scanner(System.in);
        
        num=aleatorio(num);
        
        System.out.println("Introduzca un número: ");
        num2=sc.nextInt();
        
        
        while((!(num2==num))&&(cont<6))
        {
            cont++;
            
                     switch (cont) { 
            case 1:
                fallo1();
     
            break;
            case 2:
                fallo2();
            break;
                 
            case 3 :
                
                fallo3();
    
            break;
            
            case 4 :
                
                fallo4();
    
            break;
            
            case 5 :
                
                fallo5();
    
            break;
            
            case 6 :
                
                fallo6();
    
            break;
            default:
                System.out.println("Qué");
    
        }
            
            if (num2>num) 
            {
                System.out.println("El número ha sido mayor");
            }
            else 
            {
                System.out.println("El número ha sido menor");
            }
            
            System.out.println("Introduzca un número: ");
            num2=sc.nextInt();
            
   
        }
        if(num2==num)
        {
        System.out.println("¡Has acertado!");
        }
        else
        {
            fallo7();
        }
        
        
    }
    
    private static int aleatorio(int a)
    {
        return (int)(Math.random()*120+1); 
    }
  private static void fallo1 ()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
    }
    /**************************************************************************/
    private static void fallo2()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 6; i++)
            System.out.println("\t\t  |   |");
    }
    /**************************************************************************/
    private static void fallo3()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");    
    }
        
    /**************************************************************************/
    private static void fallo4()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");    
    }
    /**************************************************************************/
    private static void fallo5()
    {
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println("\t\t       \\");
        System.out.println("\t\t        \\");
        System.out.println("\t\t         \\");
        System.out.println("\t\t          \\");
    }
    /**************************************************************************/

    private static void fallo6()
    {
        
        System.out.println("\t\t _______ ");
        System.out.println("\t\t/       \\");
        System.out.println("\t\t| #   # | ");
        System.out.println("\t\t|   @   |");
        System.out.println("\t\t|  ---  |");
        System.out.println("\t\t|_______|");
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println("\t         /     \\");
        System.out.println("\t        /       \\");
        System.out.println("\t       /         \\");
        System.out.println("\t     _/           \\_");
    }
    /**************************************************************************/

    private static void fallo7()
    {
        for (int i = 1; i<= 2; i++)
            System.out.println("\t\t  |   |");
            System.out.println("\t\t  |   |");
            System.out.println("\t>---------|   |---------<");
        for (int i = 1; i<= 3; i++)
            System.out.println("\t\t  |   |");
        System.out.println(" _______         /     \\");
        System.out.println("/       \\       /       \\");
        System.out.println("| -   - |      /         \\");
        System.out.println("|   -   |    _/           \\_");
    } 
}
