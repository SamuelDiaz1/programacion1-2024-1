/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ParqueaderoTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test ");
        Parqueadero parqueadero=new Parqueadero("Parqueaderito", 1000, 500, 6, 6);
        assertEquals("Parqueaderito", parqueadero.getNombre());
        assertEquals(1000, parqueadero.getTarifaHoraCarro());
        assertEquals(500, parqueadero.getTarifaHoraMoto());
        assertEquals(6, parqueadero.getFilas());
        assertEquals(6, parqueadero.getColumnas());

        LOG.info("Finalizando test ");
    }
    @Test
    public void datosNulos(){
        LOG.info("Iniciando test");
        
        assertThrows(Throwable.class, () -> new Parqueadero(null, 0, 0, 0,0));
        LOG.info("Finalizando test");


    }
}
