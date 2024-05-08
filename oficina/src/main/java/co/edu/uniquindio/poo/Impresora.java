package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Impresora extends EquipoElectronico{
    private final TipoEstado tipoEstado;
    private final String modelo;
    public Impresora(String codigo, String nombre, String marca, LocalDate fecha, TipoEstado tipoEstado,String modelo) {
        super(codigo, nombre, marca, fecha);
        this.tipoEstado = tipoEstado;
        this.modelo=modelo;
        assert modelo != null && modelo.isBlank();
    }
    public TipoEstado getTipoEstado() {
        return tipoEstado;
    }
    
    public String getModelo() {
        return modelo;
    }
    

}
