package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PuestoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());
    @Test
    public void datosCompletos(){
        LOG.info("Inicio prueba datos completos");
        Puesto puesto= new Puesto(4, 4);
        assertEquals(4, puesto.getCoordenadaI());
        assertEquals(4, puesto.getCoordenadaJ());
        LOG.info("Fin prueba datos completos");
    }
    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datos nulos ");
        assertThrows(Throwable.class, () ->new Puesto(0, 0));
        LOG.info("Fin prueba datos nulos");
    }
}
