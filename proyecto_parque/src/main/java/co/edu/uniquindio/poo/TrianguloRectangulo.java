package co.edu.uniquindio.poo;


public class TrianguloRectangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;

    public TrianguloRectangulo(double base, double altura) {
        assert base > 0.0 : "Error, no se puede crear un triángulo rectángulo con base negativa";
        assert altura > 0.0 : "Error, no se puede crear un triángulo rectángulo con altura negativa";

        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
