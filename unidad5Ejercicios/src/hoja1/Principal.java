
package hoja1;

import java.util.ArrayList;


public class Principal 
{
    public static void main(String[] args) 
    {
         ArrayList <Integer> lista = new ArrayList<Integer>();
         generar(lista);
         System.out.println(lista);
         System.out.println(suma(lista));
         insertar(lista);
         System.out.println(lista);
         eliminar(lista);
         System.out.println(lista);

    }
/******************************************************************************************************************************************/
   
    static private void generar (ArrayList <Integer> lista)
    {
        for (int i = 0; i < 20; i++) 
        {
            lista.add((int) (Math.random() * 5) + 1);
        }
    }
    /******************************************************************************************************************************************/
    
    static private int suma (ArrayList <Integer> lista)
    {
        int suma=0;
        
        for (Integer i : lista) 
        {
            suma=suma+i;
        }
        
        return suma;
    }
/******************************************************************************************************************************************/
    static private void insertar (ArrayList <Integer> lista)
    {
        lista.add(lista.size(),1);
        lista.add(0,1);
    }
/******************************************************************************************************************************************/
    static private void eliminar (ArrayList <Integer> lista)
    {
        lista.removeIf(i -> (i%2 != 0));
    }
}
