package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Camara extends EquipoElectronico implements Imprimible{

    public Camara(String codigo, String nombre, String marca, LocalDate fechaAdquisicion) {
        super(codigo, nombre, marca, fechaAdquisicion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimir(Publicacion publicacion) {
       JOptionPane.showMessageDialog(null,"Imprimiendo foto");
    }
}
