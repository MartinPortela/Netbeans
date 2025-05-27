
package examenPractica;

import java.util.Scanner;


public class Principal 
{
    //Constante pedida en el ejercicio
    static final int N = 4;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int reintegro;
        int seleccion;
        /*Objeto creado para llamar a los métodos de Bonoloto*/
        Juego sorteo=new Bonoloto();
        /*Creo aquí mi jugada*/
        Bonoloto.crearBoleto(((Bonoloto)sorteo).getBoleto());
        reintegro=(int) ((Math.random() * 9)+1);
        for (int i = 0; i < N ; i++) 
        {
            sorteo=new Bonoloto();
            System.out.println("Sorteo número "+i);
            System.out.println(" ");
            imprimirSorteo(sorteo, ((Bonoloto)sorteo).getBoleto(), reintegro);
            System.out.println(" ");
            ((Bonoloto)sorteo).getSorteos().add(sorteo);
        }
        
        System.out.println("Elige el sorteo: ");
        seleccion=sc.nextInt();
        
        imprimirSorteo(((Bonoloto)sorteo).getSorteos().get(seleccion),((Bonoloto)sorteo).getBoleto(), reintegro);
    }

    /***************************************************************************************************/ 
    private static void imprimirSorteo(Juego sorteos, int boleto[], int reintegro)
    {
        int premios[]=new int [4];
        int cont=0;
        boolean complementario=false;
        boolean reintegroComp=false;
        //Variable suma para los premios
        double suma=0;
        System.out.print("MI JUGADA: ");
        
        //for para imprimir mi jugada
        for (int i = 0; i < boleto.length; i++) 
        {
            System.out.print(boleto[i]);
            System.out.print(" ");
        }
        System.out.print("R:"+reintegro);
        System.out.print(" -- ESTE SORTEO: ");
        
        //for para imprimir el sorteo
        for (int i = 0; i < sorteos.getBoletoJuego().length; i++) 
        {
            System.out.print(sorteos.getBoletoJuego()[i]+" ");
        }
        
        System.out.print("C:"+sorteos.getComplementario()+" R:"+sorteos.getReintegro());
        
        //Asigno los valores para premios de combinaciones sin reintegro o complementario
        premios[0]=4;
        premios[1]=25;
        premios[2]=1500;
        premios[3]=2000000;
        
        for (int i = 0; i < boleto.length; i++) 
        {
            for (int j = 0; j < sorteos.getBoletoJuego().length; j++) 
            {
               if (sorteos.getBoletoJuego()[j]==boleto[i])
               {
                   cont++;
                   if (cont>=3) 
                   {
                       System.out.println(" Se ha obtenido una combinació de: "+cont+" aciertos ");
                   }
               }
            }
            
            if(boleto[i]==sorteos.getComplementario())
                {
                    complementario=true;
                }
        }
        if (reintegro==sorteos.getReintegro()) 
                {
                    reintegroComp=true;
                }
        if(cont>=3)
        {
            //Aquí le resto el contador para que se pueda realizar el array correctamente empezando el 0 si la combinación ha sido de 3
            cont=cont-3;
        for (int i = 0; i <= cont; i++) 
        {
            suma=premios[i]+suma;
        }
        if(cont==2 || complementario)
        {
            suma=suma+100000;
            System.out.println(" Se ha obtenido un acierto de 5+C");
        }
        }
        if(reintegroComp)
        {
            suma=suma+0.5;
            System.out.println(" Se ha obtenido reintegro");
        }
        
        System.out.println(" TOTAL PREMIOS: "+suma);
    }
}
