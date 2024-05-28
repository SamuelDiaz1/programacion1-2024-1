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
        assert placa != null && !placa.isBlank() : "La placa del vehículo no debe ser nula o vacía";
        assert marca != null && !marca.isBlank() : "La marca del vehículo no debe ser nula o vacía";
        assert modelo != null && !modelo.isBlank() : "El modelo del vehículo no debe ser nulo o vacío";
        assert propietario != null : "El propietario del vehículo no debe ser nulo";

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
