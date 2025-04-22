
package ClaseMetodos;

import java.util.Scanner;


public class claseMetodo 
{
    public static void main(String[] args) 
    {
        String cadena = "Todos los seres humanos nacen libres e iguales en dignidad y derechos y, "
                + "dotados como están de razón y conciencia, deben comportarse fraternalmente los unos con los otros" ;
        int dato1, dato2, dato3;
        dato1=20;
        dato2=40;
        dato3=20;
        
        
        //sumaTodos()
        System.out.println(sumaTodos(dato1, dato2, dato3));
        
        //hayIguales()
        if (hayIguales(dato1, dato2, dato3)) 
        {
            System.out.println("Hay iguales");
        }
        else
            System.out.println("No hay iguales");
        
        //puntoFinal()
        
        System.out.println(puntoFinal(cadena));
        
        //espacios
        
        espacios(cadena);
        
        //espacios2
        
        System.out.println(espacios2(cadena));
        
        //LeerDatos()
        
        dato1=LeerDatos();
        dato2=LeerDatos();
        dato3=LeerDatos();
        
        //rellena()
        
        rellena(cadena, dato1);
        
        //perfecto()
        
        if (perfecto(dato3)) 
        {
            System.out.println("El número "+dato3+" es perfecto");
        }
        else 
        {
            System.out.println("El número "+dato3+" no es perfecto");
        }
        
        //numeroDentroDeUnRango()
        
        Scanner sc = new Scanner(System.in);
        int le;
        int lo;
        
        System.out.println("Introduzca el mínimo y el máximo: ");
        le=sc.nextInt();
        lo=sc.nextInt();
        
        System.out.println("El número es: "+numeroDentroDeUnRango(le, lo));
        
        //aleatorio()
        
        System.out.println(aleatorio(le, lo));
        
        //estudianteAleatorio()
        
        System.out.println(estudianteAleatorio(lo));
        
        
        
        
    }//main
    
    /*******************************************************************************************************************************************/
    private static int sumaTodos(int a, int b, int c)
    {
        return (a+b+c);
    }
    /*******************************************************************************************************************************************/
    private static boolean hayIguales(int a, int b, int c)
    {
     return ((a==b)||(b==c)||(a==c)); 
    }
     /*******************************************************************************************************************************************/
    private static String puntoFinal(String hola)
    {
       return hola=hola+".";
    }
     /*******************************************************************************************************************************************/
    private static void espacios(String adios)
    {
        int cont=0;
          for (int i = 0; i < adios.length(); i++)
          {
              if (adios.charAt(i)==' ') 
              {
                  cont++;
              }
          }
          System.out.println("El número de espacios es: "+cont);
    }
    /*******************************************************************************************************************************************/
    private static int espacios2(String tal)
    {
        
        int cont1=0;
          for (int i = 0; i < tal.length(); i++)
          {
              if (tal.charAt(i)==' ') 
              {
                  cont1++;
              }
          }
         return cont1;
    }
    /*******************************************************************************************************************************************/
    private static int LeerDatos()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca valor: ");
        
        return sc.nextInt();
    }
     /*******************************************************************************************************************************************/
    private static void rellena(String ye, int a)
    {
        while (ye.length()<a)
        {
            ye=ye+" ";
        }
       ye=ye+"."; 
        System.out.println(ye);
    }
     /*******************************************************************************************************************************************/
    private static boolean perfecto(int b)
    {
        int ola=0;
        for (int i = 1; i < b; i++)
        {
            if (b%i==0) 
            {
                ola=ola+i;
            }
        }
      
        return ola==b;
    }
     /*******************************************************************************************************************************************/
    private static int numeroDentroDeUnRango(int a, int b)
    {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor: ");
        c=sc.nextInt();
        
        while ((c<a)||(c>b))
        {
            System.out.println("Introduzca otro valor: ");
            c=sc.nextInt();
        }
        
        return c;
    }
     /*******************************************************************************************************************************************/
    private static int aleatorio(int a, int b)
    {
        int c = (int)(Math.floor(Math.random()*(b-a+1)+a));
        
        return c;
    }
     /*******************************************************************************************************************************************/
    private static String estudianteAleatorio(int a) 
    {
        int b;
        String epa;
        b=(int)Math.floor(Math.random()*a+1);
        
        return epa="Estudiante"+b; 
    }
}
