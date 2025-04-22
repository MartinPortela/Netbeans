
package Hoja4;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        String  notasCalculo[]  = new String[5];
        String  notasAlgebra[]  = new String[5];
        String  alumnos[]   =  new String[5];
        String  aprobados[] = new String[15];
        
        solicitarNombres(alumnos);
        
        
    }
    
    private static void solicitarNombres(String alumn[])
    {
        System.out.println("Indique los nombres: ");
         Scanner sc=new Scanner(System.in);
        for (int i = 0; i < alumn.length; i++) 
        {
            alumn[i]=sc.nextLine();
        }
    }
    
    private static void pedirNotas(String calculo[],String algebra[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Inserte las notas de cálculo y de algebra correspondientes: ");
        for (int i = 0; i < calculo.length; i++) 
        {
            calculo[i]=sc.nextLine();
            algebra[i]=sc.nextLine();
            
        }
    }
    
    private static void calcularAprobados(String aprobados[],String alumnos[], String calculo[], String algebra[])
    {
        int cont=0;
        int cont2=0;
        double cinco=5;
        
        for (int i = 0; i < aprobados.length; i++) 
        {
            if (calculo[cont]>=cinco) 
            {
                if (algebra[cont2]>=5) 
                {
                    aprobados[i+1]=calculo[cont];
                }
            }
        }
    }
}
