package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class EquipoElectronico {
    private final String codigo;
    private final String nombre;
    private final String marca;
    private final LocalDate fechaAdquisicion;
    /**
     * @param codigo
     * @param nombre
     * @param marca
     * @param fechaAdquisicion
     */
    public EquipoElectronico(String codigo, String nombre, String marca, LocalDate fechaAdquisicion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaAdquisicion = fechaAdquisicion;
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * @return the fechaAdquisicion
     */
    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    
}
