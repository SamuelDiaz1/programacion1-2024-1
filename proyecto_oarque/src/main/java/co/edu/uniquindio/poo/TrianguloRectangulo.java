package co.edu.uniquindio.poo;

public class TrianguloRectangulo extends Zona{
    private final double base;
    private final double altura;
    public TrianguloRectangulo(String nombreZona, Material material, double base, double altura) {
        super(nombreZona, 0,material);
        this.base = base;
        this.altura = altura;
        assert  base>0:"La base debe ser mayor a cero";
        assert  altura>0:"La altura debe ser mayor a cero";

    }
    public double getAreaTrianguloRectangulo() {
        return (base*altura)/2;
    }
    

}
