
package Practica3;

import java.util.Scanner;


public class cc 
{
    public static void main(String[] args) 
    {
        int suc;
        int banc;
        int cod1;
        int cod2;
        int cuenta;
        int suc2;
        int banc2;
        int cuenta2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte el identificador para el banco");
        banc=sc.nextInt();
        System.out.println("Inserte el identificador para la sucursal");
        suc=sc.nextInt();
        System.out.println("Inserte el identificador para la cuenta");
        cuenta=sc.nextInt();
        
        //Variables para almacenar los dígitos del banco
        int a=(banc%10)*10;
        banc2=banc/10;
        int b=(banc2%10)*5;
        banc2=banc2/10;
        int c=(banc2%10)*8;
        banc2=banc2/10;
        int d=(banc2%10)*4;
        
        //Variables para almacenar los dígitos de la sucursal
        int e=(suc%10)*6;
        suc2=suc/10;
        int f=(suc2%10)*3;
        suc2=suc2/10;
        int g=(suc2%10)*7;
        suc2=suc2/10;
        int h=(suc2%10)*9;
        
        cod1=(a+b+c+d+e+f+g+h)%11;
        
        cod1=11-cod1;
        
        if ((cod1==10)||(cod1==11) ) 
        {
            if (cod1==10) 
            {
                cod1=1;
            }
            cod1=0;
        }//Fin If
        
        int i=(cuenta%10)*6;
        cuenta2=cuenta/10;
        int j=(cuenta2%10)*3;
        cuenta2=cuenta2/10;
        int k=(cuenta2%10)*7;
        cuenta2=cuenta2/10;
        int l=(cuenta2%10)*9;
        cuenta2=cuenta2/10;
        int m=(cuenta2%10)*10;
        cuenta2=cuenta2/10;
        int n=(cuenta2%10)*5;
        cuenta2=cuenta2/10;
        int o=(cuenta2%10)*8;
        cuenta2=cuenta2/10;
        int p=(cuenta2%10)*4;
        cuenta2=cuenta2/10;
        int q=(cuenta2%10)*2;
        cuenta2=cuenta2/10;
        int r=(cuenta2%10)*1;
        
        cod2=(i+j+k+l+m+n+o+p+q+r)%11;
        
        cod2=11-cod2;
        
          if ((cod2==10)||(cod2==11) ) 
        {
            if (cod2==10) 
            {
                cod2=1;
            }
            cod2=0;
        }//Fin If
          
          System.out.println(banc+" "+suc+" "+cod1+""+cod2+" "+cuenta);
        
    }//Main 
}//Class
