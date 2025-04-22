
package Personas;


public class estudiante extends persona 
{
    private int numExpediente;
    private String titulacion;

    public estudiante(int numExpediente, String titulacion, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numExpediente = numExpediente;
        this.titulacion = titulacion;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public String getTitulacion() {
        return titulacion;
    }
    
    public void estudiar()
    {
        System.out.println("ESTUDIANDO...................");        
    }
    
    public void examinarse()
    {
          System.out.println("EXAMINANDO...................");      
    }
    
    @Override
    public void visualizarInfo()
    {
        System.out.println("NOMBRE: "+getNombre()+" APPELIDOS: "+getApellidos()
        +" NUM EXPEDIENTE: "+numExpediente+" TITULACION: "+titulacion);        
    }
                
}
