
package examenPractica;


public class Juego 
{
    int boletoJuego[]=new int[6];
    int reintegro;
    int complementario;

    public Juego() 
    {
        boletoJuego=crearBoletoJuego(boletoJuego);
        reintegro=(int) ((Math.random() * 9)+1);
        complementario=complementarioCreacion(boletoJuego, complementario);
    }
     /***************************************************************************************************/
    public static int[] crearBoletoJuego(int boletoJuego[])
    {
        for (int i = 0; i < boletoJuego.length; i++) 
        {
            //booleano para salirme del while, que comprueba que no se repitan números
            boolean comprobar=false;
            boletoJuego[i]=(int) ((Math.random() * 49)+1);
            //Para que no comience en 0, pues es el primer número, pongo este if
            if(i!=0){
            while(!comprobar)
            { int cont=0;
            for (int j = 0; j < i; j++) 
            {
                if (boletoJuego[j]==boletoJuego[i]) 
                {
                    //contador que sirve para revisar repeticiones 
                  cont++;
                }
            }
            //Si ha habido al menos una, se pide otro número
            if (cont!=0) 
                {
                   boletoJuego[i]=(int) ((Math.random() * 49)+1);
                }
            else
            {
                comprobar=true;
            }
            }//fin de while
            }//fin if
        }
        return boletoJuego;
    }
     /***************************************************************************************************/
    
    //Método que crea el complementario y sin repetirse con los números de la apuesta
    public static int complementarioCreacion(int boletoJuego[], int complementario)
    {
        complementario=(int) ((Math.random() * 49)+1);
        boolean comprobar=false;
        while(!comprobar)
        {
            int cont=0;
            for (int i = 0; i < boletoJuego.length; i++)
            {
                if (boletoJuego[i]==complementario) 
                {
                  cont++;
                }
            }
            if (cont!=0) 
                {
                   complementario=(int) ((Math.random() * 49)+1);
                }
            else
            {
                comprobar=true;
            }
        }
        return complementario;
    }
 /***************************************************************************************************/
    public int[] getBoletoJuego() {
        return boletoJuego;
    }

 /***************************************************************************************************/
    public int getReintegro() {
        return reintegro;
    }

 /***************************************************************************************************/
    public int getComplementario() {
        return complementario;
    }
    
}
