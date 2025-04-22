
package pooteoría1;

public class Estudiante 
{
    //atributos
    private String nombre;
    private int edad;
    private String acceso;
    private boolean mayorEdad;
    
    //métodos 

    public Estudiante(String nombre, int edad, String acceso) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.acceso = acceso;
        establecerMayoriaEdad();
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        establecerMayoriaEdad();
    }


  
    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        establecerMayoriaEdad();
    }
    
    
    
    public void cumpleannos()
    {
       edad=edad+1;  
       establecerMayoriaEdad();
    }
    private void establecerMayoriaEdad() {
    if (edad >= 18)
        mayorEdad=true;
    else
        mayorEdad=false;
}

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", acceso=" + acceso + ", mayorEdad=" + mayorEdad + '}';
    }

   

   
    
}
