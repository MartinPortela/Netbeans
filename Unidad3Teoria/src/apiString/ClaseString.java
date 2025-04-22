package apiString;

import java.util.Scanner;



public class ClaseString {

    public static void main(String[] args) {
        String nombre = "Java";
        String cadena = "Java";
        String  email   ="sopas@gmail.com";
        Scanner entrada=new Scanner(System.in);

        int l;

        l = nombre.length();

        System.out.println(l);

        System.out.println("La cadena " + nombre + " tiene " + nombre.length() + " caracteres");

        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));

        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(1));
        }
        if (nombre.equals(cadena)) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }
        System.out.println(nombre.toUpperCase());
        
        System.out.print("Introduce un texto: ");
        nombre=entrada.nextLine();
        System.out.println(nombre);
        System.out.println(nombre.charAt(nombre.length()-1));
        
        //correo es correcto
      boolean correcto = false;
        for (int i = 0; i < email.length(); i++) 
        {
            if (email.charAt(i)== '@') 
            {
                correcto = true;
            }
           
        }
        
         if (correcto == true) 
         {
                System.out.println("Email correcto");
         }
         else
             System.out.println("email incorrecto");
         
         //dividir cadena
         
         System.out.println(email.substring(12));
         System.out.println(email.substring(0, 10));
         
    }//main

}
