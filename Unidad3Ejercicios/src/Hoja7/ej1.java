
package Hoja7;

import java.util.Scanner;


public class ej1 
{
    public static void main(String[] args) 
    {
        String correo;
        String usuario;
        String direc;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Indique su correo: ");
        
        correo=sc.nextLine();
        
        if ((Character.isDigit(correo.charAt(0))==true) || (correo.contains("@")==false))
        {
            System.out.println("Dirección de correo no válida");
        }
        else
        {
        for (int i = 0; i < correo.length(); i++) 
        { 
            if (correo.charAt(i)=='@') 
            {
                usuario=correo.substring(0, i);
                direc=correo.substring(i+1, correo.length());
                
                System.out.println("Dirección: Correcta");
                System.out.println("usuario: "+usuario.toLowerCase());
                System.out.println("dominio: "+direc.toLowerCase());
                
            }//if
           
        }//for
        }//else
    }//main
}
