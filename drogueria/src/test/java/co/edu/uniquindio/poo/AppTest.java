/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        Drogueria drogueria= new Drogueria("Drogas");
        Gerente gerente= new Gerente("Rodolfo R", "Hernandes", "101234", "Paraiso 246", "1234567890", 34500);
        Medicina medicina= new Medicina("245", "Gripaldo", "Medicamento para la gripa", 450, 7, "Supermas", 12);
        gerente.agregarProducto(medicina);
        drogueria.agregarEmpleado(gerente);
        System.out.println(drogueria.getListaProductos()); 


       LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
