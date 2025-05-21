
package practica1MUS;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Principal 
{
    public static void main(String[] args) 
    {
        int cont;
        cartas cartas[]=new cartas[40];
        jugador jugadores[]=new jugador[4];
        crearBaraja(cartas);
        for (int i = 0; i < 4; i++) 
        {
            jugadores[i]=new jugador(i+1);
            asignarBaraja(jugadores[i], cartas);
        }
        
        escribir(jugadores);
        
    }
    
    private static void crearBaraja (cartas cartas[])
    {
        for (int i = 0; i < 10; i++) 
        {
            cartas[i]=new cartas("oros");
        }
        for (int i = 10; i < 20; i++) 
        {
            cartas[i]=new cartas("espadas");
        }
        for (int i = 20; i < 30; i++) 
        {
            cartas[i]=new cartas("copas");
        }
        for (int i = 30; i < 40; i++) 
        {
            cartas[i]=new cartas("bastos");
        }

    }
    
    private static void asignarBaraja(jugador jugadores, cartas cartas[])
    {
        int cont;
        cartas baraja[]=new cartas[4];
           
           for (int j = 0; j < 4; j++) 
            {
                cont = (int) (Math.random() * 39);
                while(cartas[cont]==null)
                {
                    cont = (int) (Math.random() * 39);
                }
                baraja[j]=cartas[cont];
                cartas[cont]=null;
            }
           jugadores.setBaraja(baraja);
           jugadores.setSuma(baraja[0].getPuntos()+baraja[1].getPuntos()+baraja[2].getPuntos()
                   +baraja[3].getPuntos());
           if(jugadores.getSuma()>=31)
           {
               jugadores.setJuego(true);
           }
            asignarPares(jugadores, baraja);
        
    }
    
    private static void asignarPares(jugador jugadores, cartas barajas[])
    {
        int cont0=1;
        int cont1=1;
        int cont2=1;
        for (int i = 1; i < 4; i++) 
        {
            if(barajas[0].getPuntos()==barajas[i].getPuntos())
            {
                cont0++;
            }
        }
        for (int i = 2; i < 4; i++) 
        {
            if(barajas[1].getPuntos()==barajas[i].getPuntos())
            {
                cont1++;
            }
        }
        if(barajas[2].getPuntos()==barajas[3].getPuntos())
        {
            cont2++;
        }
        
        if (cont0==3 || cont1==3) 
        {
            jugadores.setPares("PARES: SÍ medias");
        }
        else if((cont0==2 && cont1==2) || (cont0==2 && cont2==2) || (cont1==2 && cont2==2))
        {
           jugadores.setPares("PARES: SÍ dobles parejas"); 
        }
        else if(cont0==2 || cont1==2 || cont2==2)
        {
            jugadores.setPares("PARES: SÍ parejas");
        }
        else
        {
            jugadores.setPares("PARES: NO");
        }
    }
    
    private static void escribir(jugador jugadores[])
    {
        
        FileWriter fw = null;
        
        try 
        {
            fw = new FileWriter("C:/ficheros/salida.txt");
            PrintWriter salida = new PrintWriter(fw);
                              
            for (int i = 0; i < 4; i++)
            {
                salida.println("JUGADOR "+jugadores[i].getJugador());
                salida.println(jugador.imprimir(jugadores[i].getBaraja()));
                salida.println(jugadores[i].getPares());
                if (jugadores[i].isJuego()==true) 
                {
                   salida.println("JUEGO: SÍ "+jugadores[i].getSuma()); 
                }
                else
                {
                    salida.println("JUEGO: NO");
                }
                salida.println("--------------------------------------------------------");
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fw != null) 
                    fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
    
    
}
