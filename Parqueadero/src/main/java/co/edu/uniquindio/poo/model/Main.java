package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//import java.time.LocalTime;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Mi Parqueadero", 2000, 1000, 6, 6);
    
        Vehiculo moto1 = new Moto("ABC123", "Marca1", "Modelo1", 150, TipoMoto.HIBRIDA);
        Vehiculo moto2 = new Moto("XYZ789", "Marca2", "Modelo2", 120, TipoMoto.CLASICA);
        Vehiculo moto3 = new Moto("ABC123", "Marca1", "Modelo1", 150, TipoMoto.HIBRIDA);
    
        Vehiculo carro1 = new Carro("Toyota", "2015", "XGB123");
        Vehiculo carro2 = new Carro("Mazda","2009","MRS189");
        parqueadero.asignarVehiculoAPuesto(2, 2, moto3);
        parqueadero.asignarVehiculoAPuesto(0, 0, moto1);
        parqueadero.asignarVehiculoAPuesto(2, 2, moto2);
        parqueadero.asignarVehiculoAPuesto(4, 3, carro1);
        parqueadero.asignarVehiculoAPuesto(5, 5, carro2);
        System.out.println(parqueadero);        
         LocalDate fechaIngreso = LocalDate.of(2024, 5, 23); // Fecha de ingreso
        LocalTime horaIngreso = LocalTime.of(0, 0); // Hora de ingreso (1:00 AM)
        Registro registro1 = new Registro(carro1,horaIngreso,fechaIngreso);
        registro1.registrarSalidaVehiculo();

    parqueadero.getRegistros().add(registro1);
    parqueadero.generarReporteDiario(LocalDate.now());
    
        // Mostrar un reporte de los vehículos asignados
    
       
        
    
}
    
    }
    

