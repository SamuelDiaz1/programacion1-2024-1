package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ImpresoraCartucho extends Impresora {

     public ImpresoraCartucho(String codigo, String nombre, String marca, LocalDate fechaAdquisicion, String modelo,
            EstadoImpresora estadoImpresora) {
        super(codigo, nombre, marca, fechaAdquisicion, modelo, estadoImpresora);
    }

    @Override
    public void imprimir(Publicacion publicacion) {
        JOptionPane.showMessageDialog(
            null,"Imprimiendo Publicacion "+publicacion.getTexto()+" de tipo"+ publicacion.getTipoPublicacion());
    }

    @Override
    protected void conectarImpresora() {
        setEstadoImpresora(EstadoImpresora.CONECTADA);
    }

    @Override
    protected void desconectarImpresora() {
        setEstadoImpresora(EstadoImpresora.DESCONECTADA);
    }

}
