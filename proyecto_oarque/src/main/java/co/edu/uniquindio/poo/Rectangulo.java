package co.edu.uniquindio.poo;

public class Rectangulo  {
    private final double base;
    private final double altura;
    public Rectangulo( double base, double altura) {

        this.base = base;
        this.altura = altura;
        assert  base>0:"La base debe ser mayor a cero";
        assert  altura>0:"La altura debe ser mayor a cero";

    }
    public double getAreaRectangulo() {
        return base*altura;
    }
    
    


}
