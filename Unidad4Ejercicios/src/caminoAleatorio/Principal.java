
package caminoAleatorio;


public class Principal 
{
    public static void main(String[] args) 
    {
        final int numeroNodos = 4;
        
        Nodo camino[]= new Nodo[numeroNodos];
        inicializarCamino(camino);
        generarCamino(camino,numeroNodos);
        imprimirCamino(camino);
    }
/******************************************************************************************************************************************/
    static void inicializarCamino (Nodo camino[])
    {
        for (int i = 0; i < camino.length; i++) 
        {
            camino[i]=new Nodo(i);
        }
    }
/******************************************************************************************************************************************/    
     static void generarCamino (Nodo camino[], int numeroNodos)
     {
         for (int i = 0; i < camino.length; i++) 
         {
             boolean comprobar=false;
             camino[i].setNumSig((int) (Math.random() * camino.length) );
             
             while(comprobar==false)
             {
                 int cont=0;
                 
                 for (int j = 0; j < i; j++) 
                 {
                     if (camino[i].getNumSig()==camino[j].getNumSig()) 
                     {
                        camino[i].setNumSig((int) (Math.random() * camino.length) );
                        cont++;
                     }
                 }
                 if (cont==0)
                 {
                     comprobar=true;
                 }
             }
         }
         
     }
  /******************************************************************************************************************************************/   
     static void imprimirCamino(Nodo camino [])
     {
         for (int i = 0; i < camino.length; i++) 
         {
             System.out.println("Nodo: "+camino[i].getNumNodo()+" SIG: "+camino[i].getNumSig());
         }
     }
   /******************************************************************************************************************************************/    
}
