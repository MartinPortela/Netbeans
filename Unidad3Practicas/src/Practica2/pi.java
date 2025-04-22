
package Practica2;


public class pi 
{
    public static void main(String[] args) 
    {
        double sumatorio=0;
        double  Pi;
        double  lol=1;
        double  frac=1;
        int     exp=0;
        
        while (frac>Math.pow(10, -9)) 
        {
            
            frac=1/lol;
            
            lol+=2;
            
            sumatorio=sumatorio+(frac*Math.pow(-1, exp));
            
            exp++;
            
        }
        
         Pi=4*sumatorio;
         
         System.out.println("Valor de PI calculado para límite = 1.0E-9 = "+Pi);
         
         System.out.println(exp);
    }//main
}//class
