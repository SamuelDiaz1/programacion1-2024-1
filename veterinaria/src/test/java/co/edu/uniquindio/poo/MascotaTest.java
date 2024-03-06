package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class MascotaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
    public void datosCompletos(){
        LOG.info("Inicio datosCompletos");

        var mascota=new Mascota("10912523", "Mike", "Perro", "Pitbull", 5, "Masculino", "Cafe", 4.5);

        assertEquals("10912523", mascota.id());

        assertEquals("Mike", mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Pitbull", mascota.raza());
        assertEquals(5, mascota.edad());
        assertEquals("Masculino", mascota.genero());
        assertEquals("Cafe", mascota.color());
        assertEquals(4.5, mascota.peso());
        LOG.info("Finalización datosCompletos");
        
    }
    @Test
       public void datosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(Throwable.class, () -> new Mascota(null,null,null,null,0,null,null,0));
        LOG.info("Finalización datosNulos");
    }
    @Test
    public void datosVacios() {
        LOG.info("Inicio datosVacios");
        assertThrows(Throwable.class, () -> new Mascota("", "", "", "",0,"", "", 0));
        LOG.info("Finalización datosVacios");

    }
    @Test
    public void edadNegativa() {
        LOG.info("Inicio datosNegativos");
        assertThrows(Throwable.class, () -> new Mascota("Camila","", "Alzate Rios", "109453264",-4,"camila@uniquindio.edu.co", "315635674", 4.5));
        LOG.info("Finalización datosNegativos");
    }
    



}
