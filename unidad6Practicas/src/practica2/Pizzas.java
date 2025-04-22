
package practica2;


public class Pizzas extends Plato
{
    private String tipo;

    public Pizzas(String tipo, double precio, String nombre) {
        super(precio, nombre);
        this.tipo = tipo;
    }

    public Pizzas(String tipo, double precio, String nombre, boolean oferta) {
        super(precio, nombre, oferta);
        this.tipo = tipo;
    }
    
    
}
