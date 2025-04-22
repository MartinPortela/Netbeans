
package practica2;


public class Plato
{
    private static int idSiguiente = 100; 
    private int id; 
    private double precio; 
    private String nombre; 
    private boolean oferta;

    public Plato(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        id=idSiguiente;
        idSiguiente++;
    }

    public Plato(double precio, String nombre, boolean oferta) {
        this.precio = precio;
        this.nombre = nombre;
        this.oferta = oferta;
        id=idSiguiente;
        idSiguiente++;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Plato{" + "id=" + id + ", precio=" + precio + ", nombre=" + nombre + ", oferta=" + oferta + '}';
    }
    
}
