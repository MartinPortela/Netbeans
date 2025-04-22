
package EjercicioAdicionalRelojes;

import java.util.Scanner;


public class Reloj 
{
    public static void main(String[] args) 
    {
        int horaEspejo, minEspejo;
        int horaReal, minReal;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca la hora espejo: ");
        horaEspejo=sc.nextInt();
        System.out.print("Introduzca los minutos espejo: ");
        minEspejo=sc.nextInt();
        
        if (minEspejo==00 || minEspejo==30) 
        {
            minReal=minEspejo;
        }
            else
            {
                minReal=60-minEspejo;
            }
        if (horaEspejo==12 || horaEspejo==6) 
        {
            horaReal=horaEspejo;
        }
        
        if (minEspejo==0) 
        {
            switch (horaEspejo)
            {
                case 1,2,3,4,5:
                    
                    break;
                case 7,8,9,10,11:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        

    }
}
