package co.edu.uniquindio.poo;

public class Puesto {
    private final int coordenadaI;
    private final int coordenadaJ;
    private Vehiculo vehiculo;
    private boolean ocupado;
    public Puesto(int  coordenadaI, int coordenadaJ) {
        this.coordenadaI = coordenadaI;
        this.coordenadaJ = coordenadaJ;
        this.vehiculo = null;
        this.ocupado=false;
        assert  coordenadaI > 0: "La coordenada I debe ser mayor que 0";
        assert  coordenadaJ > 0: "La coordenada J debe ser mayor que 0";

    }
    public boolean isOcupado() {
        return vehiculo != null;
    }
    public int getCoordenadaI() {
        return coordenadaI;
    }

    public int getCoordenadaJ() {
        return coordenadaJ;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public boolean getOupado(){
        return ocupado;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.ocupado=false;
    }
    public void liberarPuesto() {
        this.vehiculo = null;
        this.ocupado = false;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
