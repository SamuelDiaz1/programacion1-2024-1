package co.edu.uniquindio.poo;


public class Rectangulo extends FiguraGeometrica {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto) {
        assert ancho > 0: "Error, no se puede crear un rectángulo con ancho negativo";
        assert alto > 0: "Error, no se puede crear un rectángulo con alto negativo";
       
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }
    public double getLargo() {
        return alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}