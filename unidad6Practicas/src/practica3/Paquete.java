
package practica3;

public class Paquete 
{
    private static int idSig=1000;
    private int id;
    private int gramos;
    private int precio;
    private boolean certificado;

    public Paquete(int gramos, boolean certificado) {
        this.gramos = gramos;
        this.certificado = certificado;
        this.id=idSig;
        idSig++;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Paquete{" + "id=" + id + ", gramos=" + gramos + ", precio=" + precio + ", certificado=" + certificado + '}';
    }
    
    
    
}
