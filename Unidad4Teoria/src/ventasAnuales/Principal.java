
package ventasAnuales;
//ejercicio de la parte de teoría 2

public class Principal
{
    public static void main(String[] args)
    {
        int ventas[][]  =   new int [12][31];
        
        rellena(ventas);
       
        System.out.println(ventasMes(ventas[8]));
        
        System.out.println(ventasAnno(ventas));
        
        
    }//main()
    
    //rellenar la tabla de ventas
    private static void rellena (int ola[][])
    {
        for (int i = 0; i < ola.length; i++) 
        {
            for (int j = 0; j < ola[0].length; j++) 
            {
                ola[i][j]=(int)(Math.random()*100+100);
            }
            ola[1][28]=0;
            ola[1][28]=0;
            ola[1][30]=0;
            
            ola[3][30]=0;
            ola[5][30]=0;
            ola[8][30]=0;
            ola[10][30]=0;
        }
    }
    
    private static int ventasMes( int mes[])
    {
        int total=0;
        
        for (int i = 0; i < mes.length; i++) 
        {
            total=total+mes[i];
        }
        return total;
    }
    
    private static int ventasAnno(int ventas[][])
    {
        int total=0;
        
        for (int i = 0; i < ventas.length; i++) 
        {
            for (int j = 0; j < ventas[0].length; j++) 
            {
                
            
            total+=ventas[i][j];
            }
        }
        return total;
    }
    
   private static void mesVentas(int ola[][])
   {
       int max=0,mesMax=0,ventasMes;
       for (int i = 0; i < ola.length; i++) 
       {
           ventasMes=0;
           for (int j = 0; j < ola[0].length; j++) 
           {
               ventasMes+=ola[i][j];
           }
       }
   }
    
}//class
