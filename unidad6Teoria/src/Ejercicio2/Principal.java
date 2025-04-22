
package Ejercicio2;


public class Principal
{
    public static void main(String[] args) 
    {
        vehiculo vehiculos[]=new vehiculo[5];
        
        vehiculos[0]=new coche(1600, "gris", 1111);
        vehiculos[1]=new coche(1800, 2222);
        vehiculos[2]=new barco("blanco", 3333);
        vehiculos[3]=new barco(4444);
        vehiculos[4]=new coche(1700, "gris", 5555);
        
        series(vehiculos);
        colores(vehiculos, "gris");
        
        vehiculos[3].setColor("gris");
        vehiculos[0].setNumSerie(6666);
        vehiculos[2].setNumSerie(7777);
        
        vehiculos[4]=new tractor("compacto", "nuevo", "verde", 1000);
        ((tractor)vehiculos[4]).setTipo("usado");
        
        for (vehiculo v : vehiculos) 
        {
            v.aranncar();
        }
    }
    
    private static void series(vehiculo v [])
    {
        for (int i = 0; i < v.length; i++) 
        {
            System.out.println(v[i].getNumSerie());
        }
    }
    
    private static void colores(vehiculo v[], String color)
    {
        for (vehiculo ve : v) 
        {
            if (ve.getColor().equals("gris")) 
            {
                System.out.println(ve.getNumSerie());
            }
        }
         for (vehiculo ve : v) 
        {
            if (ve.getColor().equals("gris") && (ve instanceof coche)) 
            {
                System.out.println(ve.getNumSerie());
            }
        }       
    }
}
