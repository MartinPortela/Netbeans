
package Personas;


public class Principal {
    
    public static void main(String[] args) 
    {
        persona persona=new persona("pepe", "castillo");
        
        estudiante estudiante = new estudiante(1234, "daw1", "rebecca", "olaf");
        
        //métodos de persona
        persona.caminar();
        persona.dormir();
        
        System.out.println("");
        
        //métodos de estudiante
        estudiante.estudiar();
        estudiante.examinarse();
        
        //métodos por herencia
        estudiante.caminar();
        estudiante.dormir();
        estudiante.visualizarInfo();
        
        //POLIMORFISMO
        
        persona personas[]=new persona[30];
        personas[0]=new persona("carlos","ramirez");
         personas[1]=new persona("carla","ramirez");
        personas[2]=new estudiante(5678, "daw1", "javier", "martinez");
        
        personas[0].dormir();
        personas[1].caminar();
        personas[2].caminar();
        
        System.out.println("Por Samuel ");
        
        for (int i = 0; i < 3; i++) 
        {
            personas[i].visualizarInfo();
        }
        
        System.out.println(((estudiante)personas[2]).getNumExpediente());
    }
    
}
