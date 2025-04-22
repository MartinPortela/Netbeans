
package practica2;

import java.util.ArrayList;


public class Cliente 
{
        private String  nombre;     
        private  ArrayList <Plato> platos = new ArrayList<Plato>();     

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
        
        public void hacerPedido (Plato p)
        {
            platos.add(p);
        }
        public void visualizarMisPlatos() 
        {
            double suma=0;
            System.out.println("Este es el pedido de "+nombre);
            for (Plato p : platos) 
            {
                System.out.println(p.toString());
            }
            for (Plato p : platos) 
            {
                suma=suma+p.getPrecio();
            }            
            
            System.out.println("TOTAL: "+suma);
        }
}
