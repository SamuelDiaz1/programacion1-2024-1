package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class EquipoElectronico {
    private final String codigo;
    private final String nombre;
    private final String marca;
    private final LocalDate fecha;
    public EquipoElectronico(String codigo, String nombre, String marca, LocalDate fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.fecha = fecha;
        assert codigo !=null && codigo.isBlank();
        assert nombre !=null && nombre.isBlank();
        assert marca !=null && marca.isBlank();
        

        
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMarca() {
        return marca;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    
 
}
