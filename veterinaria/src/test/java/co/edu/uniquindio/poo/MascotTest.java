package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MascotTest {

    @Test
    public void testMascotaDatosCompletos() {
        Mascota mascota = new Mascota("Luna", "Perro", "Labrador", 5, "H", "Negro", 15.5);

        assertEquals("Luna", mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Labrador", mascota.raza());
        assertEquals(5, mascota.edad());
        assertEquals("H", mascota.genero());
        assertEquals("Negro", mascota.color());
        assertEquals(15.5, mascota.peso());
    }

    @Test
    public void testMascotaDatosNulos() {
        ;
    }
    @Test
    public void testMascotaDatosVacios() {
            Mascota mascota = new Mascota("", "Perro", "Labrador", 5, "", "Negro", 15.5);
    }
}
