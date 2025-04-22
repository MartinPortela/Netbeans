
package ejercicio3;

import java.util.Scanner;


public class principal 
{
    public static void main(String[] args) 
    {
        int todos[]=new int[1000];
        int num;
        
         Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 1000; i++) 
        {
            todos[i]=(int)(Math.random()*(9999-5000+1)+5000);
        }
        
        num=sc.nextInt();
        
        if (buscar(todos, num))
        {
            System.out.println("Está en el array");
        }
        else
        {
            System.out.println("No está");
        }
        
    }
    
    private static boolean buscar (int a[], int b)
    {
        int cont=0;
        while(!(a[cont]==b)||(cont<a.length))
        {
            cont++;
        }
      return a[cont]==b;
    }
}
