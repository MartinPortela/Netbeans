
package TablasMultiplicar;


public class Principal 
{
    //for
    public static void main(String[] args) 
    {
        
        
        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= 10; j++) 
            {
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
        //while
        System.out.println("Con WHILE");
        int num=1;
        int num2;
        int num3=1;
        int num4;
        while(num<=10)
        { 
            num2=1;
            while(num2<=10)
            {
                System.out.println(num+" x "+num2+" = "+num*num2);
                num2++;
             }
             num++;
             System.out.println("------------------");
        }   
        //do-while
        System.out.println("Con DO-WHILE");
        do
        { num4=1;
            do
            {
                System.out.println(num3+" x "+num4+" = "+num3*num4);
                num4++;
            }while(num4<=10);
            num3++;
        }while(num3<=10);   
            
       
     
    }
    
    
    
}
