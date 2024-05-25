package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

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
        this.fechaSalida = LocalDate.now();
        this.horaSalida = LocalTime.now();
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
    
    

    public long calcularHorasEstacionado() {
        return ChronoUnit.HOURS.between(horaIngreso.atDate(fechaIngreso), horaSalida.atDate(fechaSalida));
    }
}

