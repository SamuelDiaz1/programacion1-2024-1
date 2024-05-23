package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Impresora extends EquipoElectronico implements Imprimible{
    private final String modelo;
    private EstadoImpresora estadoImpresora;
    /**
     * @param codigo
     * @param nombre
     * @param marca
     * @param fechaAdquisicion
     * @param modelo
     * @param estadoImpresora
     */
    public Impresora(String codigo, String nombre, String marca, LocalDate fechaAdquisicion, String modelo,
            EstadoImpresora estadoImpresora) {
        super(codigo, nombre, marca, fechaAdquisicion);
        this.modelo = modelo;
        this.estadoImpresora = estadoImpresora;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * @return the estadoImpresora
     */
    public EstadoImpresora getEstadoImpresora() {
        return estadoImpresora;
    }
    /**
     * @param estadoImpresora the estadoImpresora to set
     */
    public void setEstadoImpresora(EstadoImpresora estadoImpresora) {
        this.estadoImpresora = estadoImpresora;
    }
    protected abstract void conectarImpresora();
    protected abstract void desconectarImpresora();

    
}
