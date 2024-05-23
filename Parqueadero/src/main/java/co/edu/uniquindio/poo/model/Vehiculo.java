package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    private final String marca;
    private final String placa;
    private final String modelo;

    public Vehiculo(String marca, String modelo,String placa) {
        this.marca=marca;
        this.placa = placa;
        this.modelo = modelo;
        assert placa != null && placa.isBlank();
        assert modelo != null && modelo.isBlank();

    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

}
