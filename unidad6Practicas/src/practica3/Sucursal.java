
package practica3;


public class Sucursal 
{
    private String nombre;
    private String direccion;
    private String encargado;
    private Paquete [] paquetes;
    private int indicePaquetes=0;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        paquetes=new Paquete[4];
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    

    public int getIndicePaquetes() {
        return indicePaquetes;
    }

    public void setIndicePaquetes(int indicePaquetes) {
        this.indicePaquetes = indicePaquetes;
    }

    public Paquete[] getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Paquete[] paquetes) {
        this.paquetes = paquetes;
    }
    
    public void asginacionPaquetes(Paquete paquete)
    {
        for (int i = 0; i < 4; i++) 
        {
            if (indicePaquetes==i) 
            {
                paquetes[i]=paquete;
            }
        }
        indicePaquetes++;
    }
    
    public void imprimirPaquetes()
    {
        for (Paquete paquete : paquetes) 
        {
            if(paquete !=null){
            System.out.println(paquete.toString());
            }
        }
    }
    
    
    
}
