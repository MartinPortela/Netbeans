
package practica3;


public class Caja extends Paquete 
{

    public Caja(int gramos, boolean certificado) {
        super(gramos, certificado);
        
        if (gramos<=150) 
        {
            setPrecio(20);
 
        }
        
        else if(gramos<=250 && gramos>150)
        {
            setPrecio(25);
        }
        else
        {
            setPrecio(30);
        }
        if(certificado==true)
        {
            setPrecio(getPrecio()+6);
        }
    }
    
}
