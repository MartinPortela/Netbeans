
package Verbos;

import java.util.Scanner;


public class verbos 
{
    public static void main(String[] args) 
    {
        String verbo, raiz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un verbo: ");
        verbo= sc.nextLine();
        
        raiz = verbo.substring(0,verbo.length()-2);
        
        System.out.println("Yo "+raiz+"o");
        System.out.println("T� "+raiz+"as");
        System.out.println("�l "+raiz+"a");
        System.out.println("Nosotros "+raiz+"amos");
        System.out.println("Vosotros "+raiz+"�is");
        System.out.println("Ellos "+raiz+"an");
    }
}
