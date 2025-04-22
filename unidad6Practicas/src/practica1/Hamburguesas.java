
package practica1;


public class Hamburguesas extends Plato
{
    private String tipo;

    public Hamburguesas(String tipo, double precio, String nombre) {
        super(precio, nombre);
        this.tipo = tipo;
    }

    public Hamburguesas(String tipo, double precio, String nombre, boolean oferta) {
        super(precio, nombre, oferta);
        this.tipo = tipo;
    }
    
    
}
