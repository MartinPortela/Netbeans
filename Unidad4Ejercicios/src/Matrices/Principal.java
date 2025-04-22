
package Matrices;


public class Principal 
{
    public static void main(String[] args) 
    {
          final int tamanio = 5;
          
          Matriz lista[]=new Matriz[tamanio];
          
          for (int i = 0; i < tamanio; i++) 
          {
            lista[i]=new Matriz(i);
            lista[i].generarMatriz();
        }
    }
  
}
