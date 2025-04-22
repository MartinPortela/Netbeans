
package U2Teoria2;

/*
    Dos clases
    Principal es la conductora (sucursal)
    Cuenta son cuentas bancarias
*/

public class Principal 
{
    public static void main(String[] args) 
    {
       Cuenta cuenta1 = new Cuenta(1111,10,"Pepito","corriente"); 
       
       Cuenta cuenta2 = new Cuenta(2222,"Pepito",10,"corriente","lolita");
       
       //cambiamos tipo de cuenta de 1111
       cuenta1.setTipoCuenta("ahorro");
       
       //llamamos a los getters() de cuenta1
        System.out.println("EL NÚMERO DE CUENTAS ES: " +cuenta1.getNumCuenta()+
                " Y EL TITULAR ES: "+cuenta1.getTitular());
        
        //ingresamos 40 euros en cuenta1
        cuenta1.ingreso(40);
        cuenta1.retirada(100);
       
       
       //visualizamos cuentas
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        
      
        
    }//main()
}
