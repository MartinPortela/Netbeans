
package practica3;

import java.util.Scanner;


public class Agencia 
{
    static Sucursal sucursalA=new Sucursal("Sucursal A");
    static Sucursal sucursalB=new Sucursal("Sucursal B");
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.print("Introduce el encargado de la sucursal A: ");
         sucursalA.setEncargado(sc.nextLine());
         System.out.print("Introduce la dirección de sucursal A: ");
         sucursalA.setDireccion(sc.nextLine());
         System.out.print("Introduce el encargado de la sucursal B: ");
         sucursalB.setEncargado(sc.nextLine());
         System.out.print("Introduce la dirección de sucursal B: ");
         sucursalB.setDireccion(sc.nextLine());
         
        generarPaquetes();
        System.out.println(sucursalA.toString());
        sucursalA.imprimirPaquetes();
        System.out.println(sucursalB.toString());
        sucursalB.imprimirPaquetes();
        
    }
   
    static private void generarPaquetes()
    {
        Paquete paquete;
        
        paquete=new Sobre(70,false);
        asignarSucursal(paquete);
        paquete=new Caja(230,false);
        asignarSucursal(paquete);
        paquete=new Caja(2078,true);
        asignarSucursal(paquete);
        paquete=new Sobre("gris",182,false);
        asignarSucursal(paquete);
        paquete=new Caja(210,false);
        asignarSucursal(paquete);
        paquete=new Caja(1000,true);
        asignarSucursal(paquete);
        paquete=new Sobre(160,true);
        asignarSucursal(paquete);
    }
    
    static private void asignarSucursal(Paquete paquete)
    {
        if (sucursalA.getIndicePaquetes()<4) 
        {
            sucursalA.asginacionPaquetes(paquete);
        }
        else
        {
            sucursalB.asginacionPaquetes(paquete);
        }
    }


}
