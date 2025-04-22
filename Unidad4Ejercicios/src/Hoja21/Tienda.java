
package Hoja21;

import Hoja21.Ordenador;


public class Tienda 
{
    private String nombre;
    private String encargado;
    private Ordenador[] ordenadores;
    private int numOrdenadores;

    public Tienda(String nombre, String encargado, int numOrdenadores) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.numOrdenadores = numOrdenadores;
        ordenadores = new Ordenador[numOrdenadores];
   
    }


    public int getNumOrdenadores() {
        return numOrdenadores;
    }
/******************************************************************************************************************************************/    
    public void annadir(String marca, int memoria, String micro, String ssoo, 
            double precio) 
    {
        int cont=0;
         while (cont < ordenadores.length && ordenadores[cont] != null) {
            cont++; 
        }

        
        if (cont < ordenadores.length) {
            
            ordenadores[cont] = new Ordenador(marca, memoria, micro, ssoo, precio);
        } else {
            System.out.println("Demasiados ordenadores"); // Array is full
        }
    }
     
 /******************************************************************************************************************************************/
    
    public boolean eliminar(String marcaOrdenador)
    {
        boolean ola=false;
        for (int i = 0; i < 4; i++) 
        {
           if(ordenadores[i] != null && ordenadores[i].getMarca().equals(marcaOrdenador))
           {
               ola=true;
               ordenadores[i]=null;
               numOrdenadores--;
           }
        }
        return ola;
    }
    
/******************************************************************************************************************************************/    
    
    public void imprimirStock()
    {
        for (int i = 0; i < 4; i++) 
        {
            if (ordenadores[i] != null){
            System.out.println(ordenadores[i].getCantidadMemoria()+" "+
                    ordenadores[i].getMarca()+" "
                    +ordenadores[i].getSistemaOperativo()+" "
            +ordenadores[i].getCaracteristicasProcesador()+" "+ordenadores[i].getPrecio());
            }
        }
    }
}
