
package practica1MUS;


public class cartas 
{
    private String tipo;
    private int puntos;
    private int valor;
    private String nombre;
    private static int valorSig=1;

    public cartas(String tipo) 
    {
        this.tipo = tipo;
        this.valor=valorSig;
        switch (valor) 
        {
            case 10:
                nombre="sota de "+tipo;
                break;
            case 11:
                nombre="caballo de "+tipo;
                break;
            case 12:
                nombre="rey de "+tipo;
                break;
            default:
                nombre=this.valor+" de "+tipo;
        }
        if(valor==1 || valor==2)
        {
           puntos=1; 
        }
        else
        {
        switch (valor) 
        {
            case 4:
                puntos=4;
                break;
            case 5:
                puntos=5;
                break;
            case 6:
                puntos=6;
                break;
            case 7:
                puntos=7;
                break;
            default:
                puntos=10;
        }
        }
        valorSig++;
        if (valorSig==8) 
        {
            valorSig=10;
        }
        if(valorSig==13)
        {
            valorSig=1;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
