package co.edu.uniquindio.poo.main;

import co.edu.uniquindio.poo.model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//import java.time.LocalTime;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", 1000, 500, 6, 6);
        Propietario propietario =new Propietario("Rodolfo","12345678");
        Vehiculo carro1 = new Carro(propietario, "Toyota","ABC123", "Toyota");
        Moto moto1 = new Moto(propietario,"XYZ789", "Yamaha", "XYR123", 125, TipoMoto.CLASICA);
        LocalTime horaIngreso= LocalTime.of(23,9);
        LocalDate fechaIngreso=LocalDate.of(2024,5,26);
        Registro registro1=new Registro(moto1,horaIngreso,fechaIngreso);
        parqueadero.calcularValorPorVehiculo(registro1);

        parqueadero.asignarVehiculoAPuesto(1, 1, registro1);
        parqueadero.asignarVehiculoAPuesto(2, 2, registro1);
        parqueadero.liberarPuesto(2,2);
        System.out.println(parqueadero);




        parqueadero.generarReporteDiario(fechaIngreso);

        parqueadero.generarReporteMensual(5,2024);





        /**
        String reporteDiario = parqueadero.generarReporteDiario();
        System.out.println(reporteDiario);

        String reporteMensual = parqueadero.generarReporteMensual();
        System.out.println(reporteMensual);
         **/
    
        // Mostrar un reporte de los vehículos asignados
    
       
        
    
}
    
    }
    

