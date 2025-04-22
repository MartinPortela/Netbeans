
package Practica1;


public class Fraccion 
{
    
    //Atributos
     private     int    numerador;
     private    int     denominador;
     private    double  cociente;
     private    String  tipo;
     
      /*****************************************************************/

    public Fraccion(int numerador, int denominador) 
    {
        this.numerador = numerador;
        this.denominador = denominador;
        estableceTipo();
        calculaCociente();
    }
    
    /*****************************************************************/

    public Fraccion(String tipo) 
    {
        estableceTipo();
        this.tipo = tipo;
        calculaCociente();
    }
    
    /*****************************************************************/
     
    private void calculaCociente()
    {
        cociente=numerador/denominador;
    }
     
    /*****************************************************************/
    
    private void estableceTipo()
    {
        if (numerador>denominador)
            tipo = "Impropia";
        else
            if (numerador<denominador)
                tipo = "Propia";
        else
                 tipo = "Unitaria";
        
    }

    /*****************************************************************/
    
    public int getNumerador() 
    {
        return numerador;
    }

    public int getDenominador() 
    {
        return denominador;
    }

    public double getCociente() 
    {
        return cociente;
    }

    public String getTipo() 
    {
        return tipo;
    }
    
    /*****************************************************************/
    
     public void multiplica(int a, int b)
     {
         numerador=numerador*a;
         denominador=denominador*b;
         estableceTipo();
     }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + ", cociente=" + cociente + ", tipo=" + tipo + '}';
    }
     
     
     
}
