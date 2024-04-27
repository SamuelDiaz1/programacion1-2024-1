package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000.0),
    GRAMA_SINTETICA(35000.0),
    GRAMA_NATURAL(20000.0),
    ASFALTO(40000.0);

    private double costoMetroCuadrado;

    Material(double costoMetroCuadrado) {
        this.costoMetroCuadrado = costoMetroCuadrado;
    }

    public double getCostoMetroCuadrado() {
        return costoMetroCuadrado;
    }
}
