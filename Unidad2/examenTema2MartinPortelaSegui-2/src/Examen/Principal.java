package Examen;

import java.util.Scanner;


public class Principal 
{   
     
    public static void main(String[] args) 
    {
        String  usuario;
        String  password3;
        int     diaCaduca3;
        int     mesCaduca3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el usuario");
        usuario=entrada.nextLine();
        System.out.println("Introduce la contraseña");
        password3=entrada.nextLine();
        System.out.println("Introduce el día de la caducidad");
        diaCaduca3=entrada.nextInt();
         System.out.println("Introduce el mes de la caducidad");
        mesCaduca3=entrada.nextInt();
        
        
        
        Usuario usuario1=new Usuario("Mortadelo","r2d2",30,11);
        Usuario usuario2=new Usuario("Filemón",30,6);
        Usuario usuario3=new Usuario(usuario,password3,diaCaduca3,mesCaduca3);
        
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
        
        System.out.println("Introduce la password del usuario 2");
        usuario2.setPassword(entrada.nextLine());
        
        System.out.println("Día que caduca usuario1 = "+usuario1.getDiaCaduca());
        System.out.println("Mes que caduca usuario1 = "+usuario1.getMesCaduca());
        
        usuario1.comprobar(31, 12);
        usuario1.comprobar(31, 10);
        
        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
    }
}

