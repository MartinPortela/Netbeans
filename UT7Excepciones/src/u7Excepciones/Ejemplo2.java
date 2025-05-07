
package u7Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Ejemplo2 
{

public static void main(String args[])
{
            try 
            {
                // Following file does not exist
                File file = new File("c:/prueba/prueba.txt");
                FileReader fr = new FileReader(file);
            }
            catch (FileNotFoundException e) 
            {
                System.out.println("File does not exist");
            }
	
}
}
