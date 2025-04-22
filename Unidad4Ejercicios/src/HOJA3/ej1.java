
package HOJA3;


public class ej1 
{
    public static void main(String[] args) 
    {
        int num[]=new int [50];
        
        llamo(num);
        
        reps(num);
        
    }
    
     private static void llamo (int o[])
    {
        for (int i = 0; i < o.length; i++) 
        {
            o[i]=(int) (Math.random()*11);
        }
    }
     
     private static void reps (int o[])
     {
         int num[]=new int [11];
         
         for (int i = 0; i < o.length; i++) 
         {
             for (int j = 0; j < num.length; j++) 
             {
                 if (o[i]==j) 
                 {
                     num[j]++;
                 }
             }
         }
         
         System.out.println("Hay "+num[0]+" 0");
         System.out.println("Hay "+num[1]+" 1");
         System.out.println("Hay "+num[2]+" 2");
         System.out.println("Hay "+num[3]+" 3");
         System.out.println("Hay "+num[4]+" 4");
         System.out.println("Hay "+num[5]+" 5");
         System.out.println("Hay "+num[6]+" 6");
         System.out.println("Hay "+num[7]+" 7");
         System.out.println("Hay "+num[8]+" 8");
         System.out.println("Hay "+num[9]+" 9");
         System.out.println("Hay "+num[10]+" 10");
     }
   
}
