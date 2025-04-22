/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.martin.pruebas;

import java.util.ArrayList;

/**
 *
 * @author prog
 */
public class GestorAnimales 
{
    private ArrayList <animal> listaAnimales;

    public GestorAnimales() 
    {
        this.listaAnimales =new ArrayList<animal>();
    }
    
    public boolean añadirAnimal(animal nuevoAnimal)
    {
         boolean comparar=true;
        for (animal lista : listaAnimales) 
        {
            if (lista.getNombre().equalsIgnoreCase(nuevoAnimal.getNombre())) 
            {
                comparar=false;
            }
        }
        if(comparar==true)
        {
            listaAnimales.add(nuevoAnimal);
        }
        return comparar;
    }
public boolean eliminarAnimal(String nombre)
    {
        boolean exito = false;
        int i=0;
        while (i<listaAnimales.size() && exito == false)
        {
            animal a = listaAnimales.get(i);
            if (a.getNombre().equalsIgnoreCase(nombre))
            {
                listaAnimales.remove(i);
                exito = true;
            }
        }
        return exito;
    }

    
    public int obtenerCantidad()
    {
        
       return listaAnimales.size();
    }
    

    
       @Override
    public String toString() {
        return "GestorAnimales{" + "listaAnimales=" + listaAnimales + '}'+"Cantidad: "+obtenerCantidad();
    }
}
