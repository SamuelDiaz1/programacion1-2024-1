package co.edu.uniquindio.poo;

/**
 * Clase que agrupa los datos de un círculo
 * 
 * @author Área de programación UQ
 * @since 2024-04
 * 
 *        Licencia GNU/GPL V3.0
 *        (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class Circulo extends FiguraGeometrica {

    private final double radio;

    
    public Circulo(double radio) {
        assert radio > 0.0 : "Error, no se puede crear un círculo con radio negativo";

        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public double calcularArea() {
        System.out.println(Math.PI * radio * radio);
        return Math.PI * radio * radio;
    }

}
