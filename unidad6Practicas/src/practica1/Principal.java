
package practica1;


public class Principal 
{
     public static void main(String[] args)      {        
         // esta es la carta (platos disponibles         
         Ternera plato1 = new Ternera("simple",15.5,"Hamburguesa de ternera b�sica");         
         Buey       plato2 = new Buey("doble",25.5,"Hamburguesa de ternera doble");         
         MasaFina    plato3 = new MasaFina("peque�a",16.75,"pizza masa fina tama�o peque�o");         
         MasaFina    plato4 = new MasaFina("mediana",25.0,"pizza masa fina tama�o mediano");         
         MasaFina    plato5 = new MasaFina("grande",31.25,"pizza masa fina tama�o grande");         
         MasaGruesa  plato6 = new MasaGruesa("peque�a", 20.0, "pizza masa gruesa tama�o peque�o");         
         MasaGruesa  plato7 = new MasaGruesa("mediana", 28.0, "pizza masa gruesa tama�o mediano");         
         MasaGruesa  plato8 = new MasaGruesa("grande", 33.60, "pizza masa gruesa tama�o grande");         
         Cliente cliente1 =new Cliente("pepe");         
         Cliente cliente2 =new Cliente("rebeca");                  
//pedido de pepe         
          cliente1.hacerPedido(plato1);         
          cliente1.hacerPedido(plato3);         
          cliente1.hacerPedido(plato7);          
// pedido de rebeca                 
          cliente2.hacerPedido(plato2);        
          cliente2.hacerPedido(plato4);         
          cliente2.hacerPedido(plato8);                  
          cliente1.visualizarMisPlatos();        
          System.out.println("");         
          cliente2.visualizarMisPlatos();    
     }//main() 
}
