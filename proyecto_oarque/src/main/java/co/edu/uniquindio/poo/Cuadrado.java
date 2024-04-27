package co.edu.uniquindio.poo;

public class Cuadrado extends Zona{
    private final double lado;

    public Cuadrado(String nombreZona, Material material, String forma, double lado) {
        super(nombreZona,0, material);
        this.lado = lado;
        assert  lado>0:"El lado debe ser mayor a cero";

    }

    
    public double getArea(){
        return lado*lado;
    }
    

}
