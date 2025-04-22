
package Practica1;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        String ip=" hola ";
        ArrayList<DireccionIP>lista = new ArrayList<DireccionIP>();
        Scanner sc = new Scanner(System.in);
        
        while(!"".equals(ip) )
        {
            System.out.println("Inserte la dirección IP");
            ip=sc.nextLine();
            if(!"".equals(ip))
            {
            lista.add(new DireccionIP(ip));
            }
        }
        
        for (DireccionIP i:lista) 
            {
                i.extraerBytes();
            }
        for (DireccionIP i:lista) 
            {
                i.comprobarClase();
            }
        for (DireccionIP i:lista) 
            {
                i.comprobarAtributo();
            }
        for (DireccionIP i:lista) 
            {
                System.out.println(i.toString());
            }
        
    }
}
