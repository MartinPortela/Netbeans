
package HOJA2;


public class ej1 
{
    public static void main(String[] args) 
    {
        int num[]=new int [100];
     
        inicializar(num);
        pon1(num);
        buscarEl1(num);
        
    }
    
    private static void inicializar(int o[])
    {
        for (int i = 0; i < o.length; i++) 
        {
            o[i]=-9;
        }
    }
    
    private static void pon1(int o[])
    {
        int e;
        e=(int)(Math.random()*100);
        o[e]=1;
    }
    
    private static void buscarEl1(int o[])
    {
        int cont=0; 
        while (o[cont]!=1)
        {
            cont++;
        }
        System.out.println("El elemento 1 se encuentra en la posición "+cont);
    }
}
