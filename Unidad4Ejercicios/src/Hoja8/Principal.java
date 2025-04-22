
package Hoja8;


public class Principal 
{
    public static void main(String[] args) 
    {
        int vector1[] = {1,2,16,29}; 
        int vector2[] = {3,19,70,83}; 
        
        int ordenado[] = new int[8]; 
        
        int i=0, j=0, k=0;
        
        for (int iteracion = 0; iteracion < ordenado.length; iteracion++) 
        {
            
            if (i<vector1.length) 
            {
            if ((vector1[i]<vector2[j]))
            {
                ordenado[k]=vector1[i];
                i++;
            }
            else
            {
                ordenado[k]=vector2[j];
                j++;
            }
            }
            else
            {
                ordenado[k]=vector2[j];
                j++;
            }
            k++;
        }//for
        
        for (int l = 0; l < ordenado.length; l++) 
        {
            System.out.println(ordenado[l]);
        }
    }
}
