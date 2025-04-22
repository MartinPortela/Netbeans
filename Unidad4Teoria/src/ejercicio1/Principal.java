
package ejercicio1;

import java.util.Scanner;


public class Principal 
{
    
    public static void main(String[] args) 
    {
        int numEstudiantes;
        Scanner sc=new Scanner(System.in);
        
        //vector de vocales
        char vocales[ ]=new char [5];
        
        //vector de temp medias anuales
        double []temperaturas= new double[12];
        
        //vector de nombres y notas de estudiantes
        System.out.print("Dime el número de estudiantes: ");
        numEstudiantes=sc.nextInt();
        
        String nombres[]= new String[numEstudiantes];
        int notas[]=new int[numEstudiantes ];
        
        //pedimos notas
        for (int i = 0; i < 2; i++) 
        {
            sc.nextLine();
            System.out.print("Introduce el nombre del estudiante "+(i+1));
            nombres[i]=sc.nextLine();
            System.out.print("Introduce la nota del estudiante "+(i+1));
            notas[i]=sc.nextInt();
        }
        //Visualizamos notas
        
        for (int i = 0; i < 2; i++) 
        {
            System.out.print("NOMBRE :"+nombres[i]);
            System.out.print("  NOTA: "+notas[i]);
            System.out.println(" ");
        }
        
        //vector de 5.000 elementos de enteros aleatorios [1..1000]
        
        int vector[]=new int[5000];
        for (int i = 0; i < 5000; i++) 
        {
            vector[i]=(int)(Math.random()*1000+1);
        }
        for (int i = 0; i < 5000; i++) 
        {
            System.out.print(vector[i]);
            System.out.println(" ");
        }
    }
    
}
