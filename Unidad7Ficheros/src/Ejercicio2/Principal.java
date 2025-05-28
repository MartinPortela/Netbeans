
package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int seleccion=0;
        ArrayList<Alumno> alumnosDam = new ArrayList<Alumno>();
        ArrayList<Alumno> alumnosDaw = new ArrayList<Alumno>();
        generarListas(alumnosDaw, alumnosDam);
        generarFicheros(alumnosDaw, alumnosDam);
        for (Alumno alumno : alumnosDaw) 
        {
           alumno.setNotaFinal(Alumno.generarNotaFinal());
        }
        for (Alumno alumno : alumnosDam) 
        {
           alumno.setNotaFinal(Alumno.generarNotaFinal()); 
        }
        
        while(seleccion!=3)
        {
            System.out.println("Elija 1 para visualizar los alumnos aprobados de DAM, 2 para DAW y 3 para salir");
            seleccion=sc.nextInt();
            
            switch (seleccion) 
            {
                case 1:
                    for (Alumno alumno : alumnosDam) 
                    {
                        if(alumno.getNotaFinal()>=5)
                        {
                            System.out.println(alumno.getNombre()); 
                        }
                    }
                    break;
                case 2:
                    for (Alumno alumno : alumnosDaw) 
                    {
                        if(alumno.getNotaFinal()>=5)
                        {
                            System.out.println(alumno.getNombre()); 
                        }
                    }
                    break;
                case 3:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Número no válido");
            }
        }
        
    }
    
    public static void generarListas(ArrayList<Alumno> alumnosDaw, ArrayList<Alumno> alumnosDam)
    {
        FileReader fr = null;
        int cont=0;
        try {
            fr = new FileReader("c:/ficheros/listado1.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) 
            {
                if(cont!=0)
                {
                    if (cont<=15) 
                    {
                       alumnosDaw.add(new Alumno("DAW", cadena));
                    }
                    else
                    {
                        alumnosDam.add(new Alumno("DAM", cadena));
                    }
                }
                cadena = entrada.readLine();//se lee la siguiente línea del fichero
                cont++;
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fr != null) 
                    fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
    
    public static void generarFicheros(ArrayList<Alumno> alumnosDaw, ArrayList<Alumno> alumnosDam)
    {
        FileWriter fw = null;
        FileWriter fwd = null;
        String cadena;
        try 
        {
            fw = new FileWriter("c:/ficheros/alumnosDam.txt");
            PrintWriter salida = new PrintWriter(fw);
            fwd = new FileWriter("c:/ficheros/alumnosDaw.txt");
            PrintWriter salidaDos = new PrintWriter(fwd);
            
            for (Alumno alumno : alumnosDaw) 
            {
                salidaDos.println(alumno.getNombre());
            }
            for (Alumno alumno : alumnosDam) 
            {
                salidaDos.println(alumno.getNombre());
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fw != null) 
                    fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
}
