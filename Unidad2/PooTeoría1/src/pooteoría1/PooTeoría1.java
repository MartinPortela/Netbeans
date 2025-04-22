
package pooteoría1;

/*
primer ejemplo de POO
Programa para crear estudiantes de 1DAW
*/

public class PooTeoría1 {

    
    public static void main(String[] args) 
    {
        
        //Instanciamos 3 estudiantes
      Estudiante estudiante1 = new Estudiante("Pepe",18,"ASMR"); 
      Estudiante estudiante2 = new Estudiante("Ana",20,"BAC");
      Estudiante estudiante3 = new Estudiante("Lucas",50);
      
      //Imprimimos sus datos
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        
        //FEOOOOO cambiamos atributos públicos
        //estudiante1.edad=19;
        //estudiante2.acceso="PRUEBA";
        //estudiante3.nombre="María";
        
        //cambiamos la forma de acceso de Ana
        estudiante2.setAcceso("PRUEBA"); 
       
        //Imprimimos el modo de acceso de Ana y de Pepe
        
        System.out.println(estudiante2.getAcceso());
        System.out.println(estudiante1.getAcceso());
        
        
        //cumple de lucas
        estudiante3.cumpleannos();
        System.out.println(estudiante3.toString());
        
        //cambiamos la edad de un estudiante
        estudiante1.setEdad(16);
        
       //Imprimimos sus datos
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
    }
    
}
