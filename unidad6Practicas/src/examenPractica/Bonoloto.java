
package examenPractica;

import java.util.ArrayList;
import java.util.Scanner;


public class Bonoloto extends Juego
{
    static int boleto[]=new int[6];
    //Arraylist static pues será global al igual que el boleto
    private static  ArrayList<Juego> sorteos = new ArrayList<Juego>();

    public Bonoloto() {
    }
    
    public static int [] crearBoleto(int boleto[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los números de la apuesta: ");
        for (int i = 0; i < boleto.length; i++) 
        {
            boolean comprobar=false;
            boleto[i]=sc.nextInt();
            if(i!=0){
            while(!comprobar)
            { int cont=0;
            for (int j = 0; j < i; j++) 
            {
                if (boleto[j]==boleto[i]) 
                {
                  cont++;
                }
            }
            if (cont!=0) 
                {
                   System.out.println("Número repetido, inténtalo de nuevo: ");
                   boleto[i]=sc.nextInt();
                }
            else
            {
                comprobar=true;
            }
            }//fin de while
            }//fin if
        }
        return boleto;
    }

    public static int[] getBoleto() {
        return boleto;
    }

    public static ArrayList<Juego> getSorteos() {
        return sorteos;
    }


    
    
    
    
}
