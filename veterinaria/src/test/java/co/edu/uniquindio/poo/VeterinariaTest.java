package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    @Test
    public void testMascotaDatosCompletos() {
        

        LOG.info("Inicio datosCompletos");

        Veterinaria veterinaria = new Veterinaria("Amigos peludos");

        assertEquals("Programación I", veterinaria.getNombre());

        LOG.info("Finalización datosCompletos");
    }


    @Test
    public void agregarMascota() {
        LOG.info("Inicio agregar mascota");
        var veterinaria= new Veterinaria("Amigos peludos");
        var mascota=new Mascota("10912523", "Mike", "Perro", "Pitbull", 5, "Masculino", "Cafe", 4.5);
        veterinaria.agregarMascota(null);
        assertTrue(veterinaria.getMascotas().contains(mascota));
        assertEquals(1, veterinaria.getMascotas().size());
        LOG.info("Final agregar mascota");
    }
    @Test
    public void testMascotaDatosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, () -> new Veterinaria(null));
        LOG.info("final datosNulos");
    }
    @Test
    public void agregarMascotaRepetida() {
        LOG.info("Inicio agregar mascota repetida");
        var veterinaria= new Veterinaria("Amigos peludos");
        var mascota1=new Mascota("10912523", "Mike", "Perro", "Pitbull", 5, "Masculino", "Cafe", 4.5);
        var mascota2=new Mascota("10912523", "Lola", "Perro", "Pincher", 5, "Femeninoo", "negroe", 2.5);
        veterinaria.agregarMascota(mascota1);
        assertThrows(Throwable.class,()->veterinaria.agregarMascota(mascota2));
    
    }



}
