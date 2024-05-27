package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private final Propietario propietario;
    private final String marca;
    private final String placa;
    private final String modelo;

    public Vehiculo(Propietario propietario,String marca, String modelo,String placa) {
        this.propietario=propietario;
        this.marca=marca;
        this.placa = placa;
        this.modelo = modelo;
        assert placa != null && placa.isBlank();
        assert modelo != null && modelo.isBlank();

    }

    public Propietario getPropietario() {
        return propietario;
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
