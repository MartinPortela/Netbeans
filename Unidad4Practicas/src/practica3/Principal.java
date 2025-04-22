
package practica3;


public class Principal 
{
    public static void main(String[] args) 
    {
        char [][] plano = new char [12][12];
        int []barcoActual={4,3,3,2,2,2,1,1,1,1};
        int indiceBarcoActual=0;
        
        for (int i = 0; i < plano.length; i++) 
        {
            plano[i][0]='T';
            plano[i][11]='T';
            for (int j = 0; j < plano[0].length; j++) 
            {
                plano[1][j]='T';
                plano[11][j]='T';
            }
        }
    }
}
