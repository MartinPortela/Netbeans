
package ejercicio2;


public class principal 
{
    public static void main(String[] args) 
    {
        int todos[]=new int[1000];
        int pares[]=new int[1000];
        int impares[]=new int[1000];
         int cont=0;
         int cont2=0;
        
        for (int i = 0; i < 1000; i++) 
        {
            todos[i]=(int)(Math.random()*(9999-5000+1)+5000);
            
            if (todos[i]%2==0) 
            {
                pares[cont]=todos[i];
                cont++;
            }
            else
            {
                impares[cont2]=todos[i];
                cont2++;
            }
        }
        
        
    }
}
