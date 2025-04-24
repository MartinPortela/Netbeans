
package practica3;


public class Sobre extends Paquete 
{
    String color;

    public Sobre(int gramos, boolean certificado) {
        super(gramos, certificado);
        
        if (gramos<=150) 
        {
            setPrecio(10);
 
        }
        
        else if(gramos<=250 && gramos>150)
        {
            setPrecio(15);
        }
        else
        {
            setPrecio(0);
        }
        if(certificado==true)
        {
            setPrecio(getPrecio()+6);
        }
    }

    public Sobre(String color, int gramos, boolean certificado) {
        super(gramos, certificado);
        this.color = color;
        
        if (gramos<=150) 
        {
            setPrecio(10);
 
        }
        
        else if(gramos<=250 && gramos>150)
        {
            setPrecio(15);
        }
        else
        {
            setPrecio(0);
        }
        if(certificado==true)
        {
            setPrecio(getPrecio()+6);
        }
    }
    
    
}
