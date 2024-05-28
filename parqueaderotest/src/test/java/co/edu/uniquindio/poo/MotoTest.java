package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;

public class MotoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Inicio prueba datos completos");
        Propietario propietario=new Propietario("Rodolfo", "11155678");
        Moto moto=new Moto(propietario, "Toyota", "2015", "XYR112", 110, TipoMoto.CLASICA);
        assertEquals("Rodolfo", moto.getPropietario().getNombre());
        assertEquals("11155678", moto.getPropietario().getCedula());
        assertEquals("Toyota", moto.getMarca());
        assertEquals("2015", moto.getModelo());
        assertEquals("XYR112", moto.getPlaca());
        assertEquals(110, moto.getVelocidadMaxima());
    }
    @Test
    public void datosNulos(){
        LOG.info("Iniciando test");
        
        assertThrows(Throwable.class, () -> new Moto(null, null, null, null,0,null));
        LOG.info("Finalizando test");


    }

}
