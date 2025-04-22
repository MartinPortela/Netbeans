
package arraysmulti;

//arrays multidimensionales

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        int temp[][];
        temp= new int[31][2];
        Scanner sc=new Scanner(System.in);
        int dia, tempMaxima, tempMinima;
        //equivalente a: int temp[][] = new int [30][2]
        System.out.println("Dime el día: ");
        dia = sc.nextInt();
        System.out.println("Dime la temp maxima: ");
        tempMaxima = sc.nextInt();
        System.out.println("Dime la temp minima: ");
        tempMinima = sc.nextInt();
        
        temp[dia-1][0] = tempMinima;
        temp[dia-1][1] = tempMaxima;
        
        for (int fila = 0; fila < 31; fila++) 
        {
            for (int col = 0; col < 2; col++) 
            {
                temp[fila][col] = (int) (Math.random());
            }
        }
        
        System.out.println("");
        
        
    }
}
