
package AnexoValor;


public class Principal 
{
    public static void main(String[] args) 
    {
        int origen []=new int[2000];
        int solucion []=new int[26];
        
        for (int i = 0; i < origen.length; i++) 
        {
            origen[i] = (int)((Math.random()*25) + 1); 
        }
        
        for (int i = 0; i < solucion.length; i++) 
        {
            int cont=0;
            
            for (int j = 0; j < origen.length; j++) 
            {
                if (origen[j]==i) 
                {
                    cont++;
                }
                
            }
            
            solucion[i]=cont;
            System.out.println(i+" tiene "+solucion[i]);
        }
    }
}
