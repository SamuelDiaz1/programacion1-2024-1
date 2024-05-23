package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private final int velocidadMaxima;
    private final TipoMoto tipoMoto;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, TipoMoto tipoMoto) {
        super(marca,modelo,placa );
        this.velocidadMaxima = velocidadMaxima;
        this.tipoMoto = tipoMoto;
        assert velocidadMaxima>0:"La velocidad debe ser mayor que 0";
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }
}
