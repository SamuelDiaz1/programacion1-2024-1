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
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del vehiculo: ");
        Vehiculo carro1 = new Carro(propietario, ma,"ABC123", "Toyota");
        Vehiculo moto1 = new Moto(propietario,"XYZ789", "Yamaha", "XYR123", 125, TipoMoto.CLASICA);
        LocalTime horaIngreso= 
        Registro registro1=new Registro(moto1,1,);
        parqueadero.asignarVehiculoAPuesto(1, 1, moto1);
        parqueadero.asignarVehiculoAPuesto(2, 2, moto1);

        System.out.println(parqueadero);

        Propietario propietarioCarro1 = parqueadero.retornarPropietario(1, 1);
        Propietario propietarioMoto1 = parqueadero.retornarPropietario(2, 2);
        Propietario propietarioPuestoVacio = parqueadero.retornarPropietario(3, 3);

        System.out.println("Propietario del vehículo en el puesto (1, 1): " + propietarioCarro1.toString());
        System.out.println("Propietario del vehículo en el puesto (2, 2): " + propietarioMoto1.toString());
        System.out.println("Propietario del vehículo en el puesto (3, 3): " + propietarioPuestoVacio);

        parqueadero.liberarPuesto(1, 1);
        parqueadero.liberarPuesto(2, 2);

        String reporteDiario = parqueadero.generarReporteDiario();
        System.out.println(reporteDiario);

        String reporteMensual = parqueadero.generarReporteMensual();
        System.out.println(reporteMensual);

        /**
        String reporteDiario = parqueadero.generarReporteDiario();
        System.out.println(reporteDiario);

        String reporteMensual = parqueadero.generarReporteMensual();
        System.out.println(reporteMensual);
         **/
    
        // Mostrar un reporte de los vehículos asignados
    
       
        
    
}
    
    }
    

