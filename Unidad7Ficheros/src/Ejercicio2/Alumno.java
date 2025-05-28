
package Ejercicio2;


public class Alumno 
{
    private String curso;
    private String nombre;
    private static int identificador=100;
    private int identificadorReal;
    private int notaFinal=0;

    public Alumno(String curso, String nombre) 
    {
        this.curso = curso;
        this.nombre = nombre;
        identificadorReal=identificador;
        identificador++;
    }
    
    public static int generarNotaFinal()
    {
        int nota;
        nota=(int) ((Math.random() * 10)+1);
        return nota;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
