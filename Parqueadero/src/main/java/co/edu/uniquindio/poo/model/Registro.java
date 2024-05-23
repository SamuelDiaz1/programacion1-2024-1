package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    private final Vehiculo vehiculo;
    private  LocalTime horaIngreso;
    private  LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    public Registro(Vehiculo vehiculo,LocalTime horaIngreso,LocalDate fechaIngreso) {
        this.vehiculo=vehiculo;
        this.horaIngreso = horaIngreso;
        this.fechaIngreso=fechaIngreso;
        assert horaIngreso!=null: "La hora de ingreso debe ser diferente a null";

    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void registrarIngresoVehiculo() {
        this.fechaIngreso = LocalDate.now();
        this.horaIngreso = LocalTime.now();
    }
    public void registrarSalidaVehiculo() {
        this.fechaSalida = LocalDate.now();
        this.horaSalida = LocalTime.now();
    }

    
}

