
package Hoja21;


public class Principal 
{
     public static void main(String[] args)  
    { 
        // creamos la tienda 
        Tienda tienda = new Tienda("Pc-Continentes","Pepe Ruiz", 4); 
         
        // creamos los PCs a la venta  
        tienda.annadir("HP", 16, "Intel iCore 7", "Windows", 1250.50); 
        tienda.annadir("Toshiba", 32, "Intel iCore 7", "Windows", 1642.70); 
        tienda.annadir("Lenovo", 32, "Intel iCore 7", "Linux", 875.0); 
        tienda.annadir("IBM", 8, "AMD", "Windows", 475.50); 
         
        imprimirEstadoActual(tienda); 
        tienda.annadir("xxx", 8, "xxx", "xxx", 1); //debe dar mensaje por no caber 
        tienda.eliminar("HP"); 
        imprimirEstadoActual(tienda); 
        tienda.eliminar("Lenovo"); 
        imprimirEstadoActual(tienda); 
 
    }//main() 
    /************************************************************/ 
    private static void imprimirEstadoActual(Tienda tienda) 
    { 
        System.out.println("******************************"); 
        System.out.println("Número de PCs actualmente a la venta : " +  
                tienda.getNumOrdenadores()); 
        tienda.imprimirStock(); 
    } 
}// class Principal

