
package practica1MUS;


public class jugador 
{
    private int jugador;
    private cartas baraja[]=new cartas[4];
    private String pares;
    private int suma;
    private boolean juego;

    public jugador(int jugador) {
        this.jugador = jugador;
        this.juego=false;
    }

    public cartas[] getBaraja() {
        return baraja;
    }

    public void setBaraja(cartas[] baraja) {
        this.baraja = baraja;
    }

    public void setPares(String pares) {
        this.pares = pares;
    }

    public void setJuego(boolean juego) {
        this.juego = juego;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public String getPares() {
        return pares;
    }

    public int getJugador() {
        return jugador;
    }

    public boolean isJuego() {
        return juego;
    }
    
    
    public static String imprimir(cartas barajas[])
    {
        String cadena;
        cadena=barajas[0].getNombre()+" "+barajas[1].getNombre()+" "+barajas[2].getNombre()+" "+barajas[3].getNombre();
        return cadena;
    }
    
}
