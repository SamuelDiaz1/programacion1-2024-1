package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class PropietarioTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());
    @Test
    public void datosCompletos(){
        LOG.info("Inicio prueba datos completos");
        Propietario propietario= new Propietario("Ronaldo", "19912023");
        assertEquals("Ronaldo", propietario.getNombre());
        assertEquals("19912023", propietario.getCedula());
        LOG.info("Fin prueba datos completos");
    }
    
    @Test
    public void datosNulos (){
        LOG.info("Inicio pueba datos nulos");
        assertThrows(Throwable.class, () ->new Parqueadero(null, 0, 0, 0, 0));
        LOG.info("Fin pueba datos nulos");
    }
    

}
