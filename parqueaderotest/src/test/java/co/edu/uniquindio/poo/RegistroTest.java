package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class RegistroTest {
    private static final Logger LOG = Logger.getLogger(ParqueaderoTest.class.getName());
    @Test
    public void datosCompletos(){
        LOG.info("Inicio prueba datos completos ");

        
        Propietario propietario=new Propietario("Rodolfo", "1234567");
        Carro carro=new Carro(propietario, "BMW", "2012", "XRT122");
        LocalTime horaIngreso= LocalTime.of(2, 10);
        LocalDate fechaIngreso=LocalDate.of(2024, 5, 28);
        Registro registro= new Registro(carro,horaIngreso , fechaIngreso);
        assertEquals("Rodolfo", registro.getVehiculo().getPropietario().getNombre());
        assertEquals("1234567", registro.getVehiculo().getPropietario().getCedula());
        assertEquals("BMW", registro.getVehiculo().getMarca());
        assertEquals("2012", registro.getVehiculo().getModelo());
        assertEquals("XRT122", registro.getVehiculo().getPlaca());
        assertEquals(LocalDate.of(2024, 5, 28), registro.getFechaIngreso());
        assertEquals(LocalTime.of(2, 10), registro.getHoraIngreso());
    }
    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datos nulos");
        assertThrows(Throwable.class,()-> new Registro(null, null, null)) ;
        LOG.info("Fin prueba datos nulos");

    }
}
