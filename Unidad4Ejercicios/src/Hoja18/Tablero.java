
package Hoja18;

import java.util.Scanner;


public class Tablero 
{
    public static void main(String[] args) 
    {
         int oca[]=new int[4];
         int muerte[]=new int[5];
         int dado;
         int pos=0;
        Casilla casillas[]=new Casilla[42];
        crearCasillas(casillas);
        System.out.println("Coloque las ocas");
        crearOcas(casillas,oca);
        System.out.println("Coloque las muertes");
        crearMuertes(casillas, muerte);
        
        //bucle del dado que se sale si llega a 41
        while (pos<41)
        {
            dado=(int) (Math.random() * (10 - 1)) + 1;
            //si la tirada supera el 41, se repite con este bucle
            while(pos+dado>41)
            {
                System.out.println("Se ha pasado, seguir tirando");
                dado=(int) (Math.random() * (10 - 1)) + 1;
            }
            System.out.print("POSICION DE PARTIDA: "+pos
                    +" SE HA OBTENIDO UN "+dado);
            pos=pos+dado;
            //switch por si sale oca o muerte, haciendo sus respectivas acciones
            switch (casillas[pos].getTipo()) {
                case "muerte":
                    System.out.println(" --> "+casillas[pos].getTipo()+
                            " POSICION ACTUAL "+0);
                    pos=0;
                    break;
                case "oca":
                    System.out.println(" --> "+casillas[pos].getTipo()+
                            " POSICION ACTUAL "+casillas[pos].getSiguiente());
                    pos=casillas[pos].getSiguiente();
                    break;
                default:
                    System.out.println(" --> "+casillas[pos].getTipo()+
                            " POSICION ACTUAL "+pos);
            }
        }
        System.out.println("FIN DE LA PARTIDA");
        
        
    }
    
/******************************************************************************************************************************************/
    private static void crearCasillas(Casilla casillas[])
    {
        for (int i = 0; i < casillas.length; i++) 
        {
            casillas[i]=new Casilla(i, "Normal", i+1);
        }
    }

/******************************************************************************************************************************************/
    private static void crearOcas(Casilla casillas[], int oca[])
    {
        //variable para recorrer el array de la oca y setear las ocas
        int cont=0;
        //para terminar de recorrer el array
        boolean comprobar=false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < oca.length; i++) 
        {
            oca[i]=sc.nextInt();
        }
        //bucle que añade las ocas
        for (int i = 0; i < casillas.length; i++) 
        {
            if(oca[cont]==i && comprobar==false)
            {
                casillas[i].setTipo("oca");
                cont++;
                if (cont==oca.length)
                {
                    cont--;
                    comprobar=true;
                }
            }
        }
        //bucle que se encarga de que la casilla siguiente sea la próxima oca
        for (int i = 0; i < casillas.length; i++) 
        {
            if (casillas[i].getTipo().equals("oca") && casillas[i].getSiguiente()==i+1) 
            {
                for (int j = i+1; j > i && j< casillas.length; j++) 
                {
                    if(casillas[j].getTipo().equals("oca") && casillas[i].getSiguiente()==i+1)
                    {
                        casillas[i].setSiguiente(casillas[j].getCasilla());
                    }
                }
            }
 
        }
    }
/******************************************************************************************************************************************/
       private static void crearMuertes(Casilla casillas[], int muerte[])
    {
        int cont=0;
        boolean comprobar=false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < muerte.length; i++) 
        {
            muerte[i]=sc.nextInt();
        }
        
          for (int i = 0; i < casillas.length; i++) 
        {
            if(muerte[cont]==i && comprobar==false)
            {
                casillas[i].setTipo("muerte");
                cont++;
                if (cont==muerte.length)
                {
                    cont--;
                    comprobar=true;
                }
            }
        }
        
        for (int i = 0; i < casillas.length; i++) 
        {
            if (casillas[i].getTipo().equals("muerte") && casillas[i].getSiguiente()==i+1) 
            { 
                casillas[i].setSiguiente(0);
            }
 
        }
    }
/******************************************************************************************************************************************/
    
    
}
