
package Hoja7;


public class Ejercicio2 
{
    public static void main(String[] args) 
    {
        int numeros [][]=new int [7][7];
        
        for (int i = 0; i < numeros.length; i++) 
        {
            for (int j = 0; j < numeros.length; j++) 
            {
                if(i==j)
                {
                    numeros [i][j]=0;
                }
                else
                    numeros[i][j]=1;
            }
        }
       
    }
}
