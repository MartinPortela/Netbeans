
package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TodosAula 
{
    public static void main(String[] args) 
    {
        FileReader fr = null;
        FileWriter fw = null;
        FileWriter fwd = null;
        try {
            fr = new FileReader("c:/ficheros/entero.txt");
            BufferedReader entrada = new BufferedReader(fr);
            fw = new FileWriter("c:/ficheros/impares.txt");
            PrintWriter salida = new PrintWriter(fw);
            fwd = new FileWriter("c:/ficheros/pares.txt");
            PrintWriter salidaDos = new PrintWriter(fwd);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) 
            {                                      //mientras no se llegue al final del fichero
                int numerito = Integer.parseInt(cadena);
                if(numerito%2==0)
                {
                   salidaDos.println(cadena);
                }
                else
                {
                    salida.println(cadena);
                }
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero
                
            }
            salida.flush();
            salidaDos.flush();
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
    }//Main
}//Class
