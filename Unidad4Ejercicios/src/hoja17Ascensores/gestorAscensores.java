
package hoja17Ascensores;

import java.util.Scanner;


public class gestorAscensores 
{
    public static void main(String[] args) 
    {
        int eleccion;
        int planta_deseada;
        
        Scanner sc = new Scanner(System.in);
        ascensor ascensores[]=new ascensor[10];
        
        crearAscensores(ascensores);
        System.out.print("Elija 1 para pedir y 2 para salir del programa: ");
        eleccion=sc.nextInt();
        while(eleccion==1)
        {
            imprimirArrays(ascensores);
            System.out.print("Indique la planta deseada: ");
            planta_deseada=sc.nextInt();
            enviarAscensor(planta_deseada, ascensores);
            System.out.print("Elija 1 para pedir y 2 para salir del programa: ");
            eleccion=sc.nextInt();
        }


    }
 /******************************************************************************************************************************************/   
    static void crearAscensores(ascensor ascensores[])
    {
        for (int i = 0; i < ascensores.length; i++) 
        {
            switch (i) 
            {
                case 0,1:
                    ascensores[i]=new ascensor(-4,0);
                    break;
                 case 2,3,4,5,6:
                    ascensores[i]=new ascensor(36,1);
                    break;
                case 7,8,9:
                    ascensores[i]=new ascensor(71,2);
                    break;                    
                default:
                    throw new AssertionError();
            }
        }
    }
/******************************************************************************************************************************************/
    static void imprimirArrays(ascensor ascensores[])
    {
        for (int i = 0; i < ascensores.length; i++) 
        {
            System.out.println(ascensores[i].toString());
        }
    
    }
/******************************************************************************************************************************************/    
    static void enviarAscensor(int planta_deseada,ascensor ascensores[])
    {
        int comparar=1000;
        int guardar=0;
        
        for (int i = 0; i < ascensores.length; i++) 
        {
            if (Math.abs(planta_deseada-ascensores[i].getPlanta())<=comparar) 
            {
                comparar=Math.abs(planta_deseada-ascensores[i].getPlanta());
                guardar=i;
            }
        }
        
        ascensores[guardar].setPlanta(planta_deseada);
        
        System.out.println("Enviando el ascensor número "+guardar);
    }
}
