
package org.martin.pruebas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnimalesTest {
    
    private GestorAnimales ga;
    
    @BeforeEach
    public void setUp()
    {
        ga = new GestorAnimales();
    }
    
    @Test
    public void añadirAnimal_DebeDevolverTrue()
    {
        animal simba = new animal("Simba","León");
       boolean resultado=ga.añadirAnimal(simba);
        int cantidad=ga.obtenerCantidad();
        assertEquals(1, cantidad);
        assertTrue(resultado);
    }
    
    @Test
    public void añadriAnimalDuplicado_DebeSalirMal()
    {
        ga.añadirAnimal(new animal("Simba", "León"));
        boolean resultado=ga.añadirAnimal(new animal("Simba", "León"));
        int cantidad=ga.obtenerCantidad();
        assertFalse(resultado);
        assertEquals(1, cantidad);
    }
    
    @Test
    public void eliminarAnimal_DebeSalirBien()
    {
        animal simba = new animal("Simba","León");
        ga.añadirAnimal(simba);
        boolean resultado=ga.eliminarAnimal("Simba");
        int cantidad=ga.obtenerCantidad();
        assertEquals(0, cantidad);
        assertTrue(resultado);
    }
    
    @Test
    public void eliminarAnimal_DebeSalirMal()
    {
        boolean resultado=ga.eliminarAnimal("cambola");
        int cantidad=ga.obtenerCantidad();
        assertEquals(0, cantidad);
        assertFalse(resultado);
    }
 
}
