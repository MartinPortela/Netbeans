
package Hoja18;


public class Casilla 
{
    private int casilla; 
    private String tipo; 
    private int siguiente; 

   

    public Casilla(int casilla, String tipo, int siguiente) {
        this.casilla = casilla;
        this.tipo = tipo;
        this.siguiente = siguiente;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
     public int getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
