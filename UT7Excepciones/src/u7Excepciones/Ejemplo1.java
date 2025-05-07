
package u7Excepciones;


public class Ejemplo1 
{
    public static void main(String[] args) 
    {
        int a[]=new int[5];
        
        try{
        for (int i = 0; i <= a.length; i++) 
        {
            a[i]=1;
        }
        }
        
        catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array fuera de rango");
    }
    }

}
