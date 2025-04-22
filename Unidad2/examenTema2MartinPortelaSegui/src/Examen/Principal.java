
package Examen;

import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        Usuario usuario1=new Usuario("Mortadelo","r2d2",30,11);
        Usuario usuario2=new Usuario("Filemón",30,6);
        Usuario usuario3=new Usuario("Mauricio","hola",31,12);
        
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
        
        System.out.println("Introduce la password del usuario 2");
        usuario2.setPassword(entrada.nextLine());
        
        System.out.println("Día que caduca usuario1 = "+usuario1.getDiaCaduca());
        System.out.println("Mes que caduca usuario1 = "+usuario1.getMesCaduca());
        
        usuario1.comprobar(31, 12);
        usuario1.comprobar(31, 10);
    }
}
