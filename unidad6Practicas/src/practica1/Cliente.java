
package practica1;


public class Cliente 
{
        private String  nombre;     
        private Plato plato1;     
        private Plato plato2;     
        private Plato plato3;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
        
        public void hacerPedido (Plato p)
        {
            if (plato1==null) 
            {
                plato1=p;
            }
            else if (plato2==null)
            {
                plato2=p;
            }
            else if (plato3==null)
            {
                plato3=p;
            }            
        }
        public void visualizarMisPlatos() 
        {
            double suma;
            System.out.println("Este es el pedido de "+nombre);
            System.out.println(plato1.toString());
            System.out.println(plato2.toString());
            System.out.println(plato3.toString());
            
            suma=plato1.getPrecio()+plato2.getPrecio()+plato3.getPrecio();
            
            System.out.println("TOTAL: "+suma);
        }
}
