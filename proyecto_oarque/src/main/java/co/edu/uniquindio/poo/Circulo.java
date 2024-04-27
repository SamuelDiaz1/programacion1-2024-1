package co.edu.uniquindio.poo;

public class Circulo extends Zona{
    private final double radio;

    public Circulo(String nombreZona, Material material, double radio) {
        super(nombreZona,0, material);
        this.radio = radio;
        assert  radio>0:"El radio debe ser mayor a cero";
    }

    public  double getAreaCirculo() {
        return Math.PI * Math.pow(radio, 2);
    }
    

}
