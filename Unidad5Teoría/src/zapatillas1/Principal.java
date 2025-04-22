
package zapatillas1;

import java.util.ArrayList;


public class Principal 
{
    public static void main(String[] args) 
    {
        ArrayList <Double> lista = new ArrayList<Double>();
        
        lista.add(75.75);
        lista.add(49.0);
        lista.add(119.2);
        lista.add(5.0);
        lista.add(92.5);
        
        System.out.println(lista);
        System.out.println(lista.get(2));
        
        recorrerLista(lista);
        
        lista.remove(119.2);
        
        modificar(lista, 57.0, 69.0);
        
         System.out.println(lista);
    }//main
    
    /******************************************************************************************************************************************/
    static private void recorrerLista(ArrayList<Double> lista)
    {
        System.out.println("");
        for (Double i:lista) 
        {
            System.out.println(i);
        }
        
        
    }
    
    static private void modificar (ArrayList<Double> lista, double antiguo, double nuevo)
    {
        
            int pos=0;
            boolean encontrado=false;
            
            while ((!encontrado)&&(pos<lista.size()))
            {
                if (lista.get(pos)==antiguo) 
                {
                    lista.set(pos, nuevo);
                    encontrado=true;
                }
                pos++;
            }
        
    }
}
