package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CarroTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());
    @Test
    public void datosCompletos(){
        LOG.info("Inicio pruba datos completos");
        Propietario propietario=new Propietario("Rodolfo", "1234567");
        Carro carro=new Carro(propietario, "BMW", "2012", "XRT122");
        assertEquals("Rodolfo", carro.getPropietario().getNombre());
        assertEquals("1234567", carro.getPropietario().getCedula());
        assertEquals("BMW", carro.getMarca());
        assertEquals("2012", carro.getModelo());
        assertEquals("XRT122", carro.getPlaca());
        LOG.info("Fin prueba datos nulos");

    }
    @Test 
    public void datosNulos (){
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class, () -> new Carro(null, null, null, null));
        LOG.info("Fin prueba datos nulos");
    }
    

}
