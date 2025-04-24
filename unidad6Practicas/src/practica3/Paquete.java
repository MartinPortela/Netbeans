
package practica3;

public class Paquete 
{
    private int id;
    private int idcont=1000;
    private int gramos;
    private int precio;
    private boolean certificado;

    public Paquete(int gramos, boolean certificado) {
        this.gramos = gramos;
        this.certificado = certificado;
        id=idcont;
        idcont++;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Paquete{" + "id=" + id + ", idcont=" + idcont + ", gramos=" + gramos + ", precio=" + precio + ", certificado=" + certificado + '}';
    }
    
    
    
}
