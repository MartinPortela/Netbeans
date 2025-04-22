
package POO2;


public class Principal 
{
    public static void main(String[] args) 
    {
        Socio socio1=new Socio("pepe",1111);
        Socio socio2=new Socio("rebecca",2222);
        
        System.out.println(socio1.getNombre());
        System.out.println(socio2.getNombre());
        
        socio2.setNumSocio(9999);
        
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
    }
}
