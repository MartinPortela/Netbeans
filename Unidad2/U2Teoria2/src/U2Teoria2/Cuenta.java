
package U2Teoria2;


public class Cuenta 
{
    //atributos
    
   private int     numCuenta;
   private String  titular;
   private double  saldo;
   private String  tipoCuenta;
   private String  Titular2;
   
   /*****************************************************************/
   
   //Constructores
    public Cuenta(int numCuenta,double saldo, 
            String titular, String tipoCuenta)
 
    {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
 /*****************************************************************/
    public Cuenta(int numCuenta, String titular, double saldo, 
            String tipoCuenta, String Titular2) 
    {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.Titular2 = Titular2;
    }
 /*****************************************************************/
    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
 /*****************************************************************/
    public int getNumCuenta() {
        return numCuenta;
    }
 /*****************************************************************/
    public String getTitular() {
        return titular;
    }
    
    /*****************************************************************/
    public void ingreso(int cantidad)
    {
        saldo=saldo + cantidad;
    }
    
    /*****************************************************************/
    
     public void retirada(int cantidad)
     {
         if (cantidad > saldo)
             System.out.println("ERROR SALDO INSUFICIENTE");
         else
              saldo=saldo - cantidad; 
         
       
     }
    
    
 /*****************************************************************/
    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", titular=" + titular + ","
                + " saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + ","
                + " Titular2=" + Titular2 + '}';
    }
    
    
   
   
   
   
}
