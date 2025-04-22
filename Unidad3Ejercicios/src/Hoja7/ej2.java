
package Hoja7;


public class ej2 
{
    public static void main(String[] args)
    {
        String cadena = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non fringilla dolor. Proin neque mi, pharetra et elit malesuada, eleifend dictum erat. "
                + "Curabitur eros tellus, lacinia nec nisi a, congue faucibus tortor. Ut ullamcorper laoreet dolor malesuada laoreet. "
                + "Ut sollicitudin scelerisque arcu, ac viverra diam malesuada eu. Phasellus facilisis nulla eu orci congue, vitae sagittis ligula rutrum. "
                + "Ut tempus eros ac dui imperdiet mattis. Fusce quis varius eros. Quisque malesuada lectus at nulla fringilla, in sodales sapien finibus";
        int contvoc=0, contcon=0, contcom=0, contesp=0;
        
        cadena=cadena.toLowerCase();
        
        for (int i = 0; i < cadena.length(); i++) 
        {
            switch (cadena.charAt(i)) 
            {
                case ' ':
                    contesp++;
                    break;
                case ',':
                    contcom++; 
                    break;
                case 'a','i','o','u','e':
                    contvoc++;
                    break;
                default:
                    contcon++;
            }
    
        }//for
      
        System.out.println("Hay "+contvoc+" vocales");
        System.out.println("Hay "+contcon+" consonantes");
        System.out.println("Hay "+contcom+" comas");
        System.out.println("Hay "+contesp+" espacios");
        
    }//main
}
