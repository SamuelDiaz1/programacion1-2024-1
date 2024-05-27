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

        Parqueadero parqueadero= new Parqueadero("PArquecars",1000,500,6,6);
        String[] options = {
                "Registrar Vehículo",
                "Asignar Vehículo a Puesto",
                "Registrar Salida de Vehículo",
                "Eliminar Vehículo",
                "Verificar Disponibilidad de Puesto",
                "Mostrar Estado del Parqueadero",
                "Salir"
        };

        int choice;

        do {
            choice = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Menú del Parqueadero",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (choice) {
                case 0:
                    registrarVehiculo(parqueadero);
                    break;
                case 1:
                    asignarVehiculoAPuesto(parqueadero);
                    break;
                case 2:
                    registrarSalidaVehiculo(parqueadero);
                    break;
                case 3:
                    eliminarVehiculo(parqueadero);
                    break;
                case 4:
                    verificarDisponibilidadPuesto(parqueadero);
                    break;
                case 5:
                    mostrarEstadoParqueadero(parqueadero);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (choice != 6);
    }

    private static void registrarVehiculo(Parqueadero parqueadero) {
        String tipoVehiculo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (Carro/Moto):");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        String nombrePropietario = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
        String cedulaPropietario = JOptionPane.showInputDialog("Ingrese la cedula del propietario:");
        int veelMaxima= Integer.
        Propietario propietario = new Propietario(nombrePropietario, cedulaPropietario);
        Vehiculo vehiculo = null;

        if (tipoVehiculo.equalsIgnoreCase("Carro")) {
            vehiculo = new Carro(propietario,marca,modelo,placa );
        } else if (tipoVehiculo.equalsIgnoreCase("Moto")) {
            vehiculo = new Moto(placa, propietario);
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de vehículo no válido.");
            return;
        }

        parqueadero.registrarVehiculo(vehiculo);
    }

    private static void asignarVehiculoAPuesto(Parqueadero parqueadero) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        Vehiculo vehiculo = parqueadero.obtenerVehiculo(placa);

        if (vehiculo == null) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            return;
        }

        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila del puesto:"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna del puesto:"));

        Registro registro = new Registro(vehiculo, LocalDate.now());
        parqueadero.asignarVehiculoAPuesto(fila, columna, registro);
    }

    private static void registrarSalidaVehiculo(Parqueadero parqueadero) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        Vehiculo vehiculo = parqueadero.obtenerVehiculo(placa);

        if (vehiculo == null) {
            JOptionPane.showMessageDialog(null, "Vehículo no encontrado.");
            return;
        }

        parqueadero.registrarSalidaVehiculo(vehiculo);
    }

    private static void eliminarVehiculo(Parqueadero parqueadero) {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        parqueadero.eliminarVehiculo(placa);
    }

    private static void verificarDisponibilidadPuesto(Parqueadero parqueadero) {
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila del puesto:"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna del puesto:"));

        boolean disponible = parqueadero.isPuestoDisponible(fila, columna);
        JOptionPane.showMessageDialog(null, "El puesto en (" + fila + ", " + columna + ") está " +
                (disponible ? "disponible." : "ocupado."));
    }

    private static void mostrarEstadoParqueadero(Parqueadero parqueadero) {
        JOptionPane.showMessageDialog(null, parqueadero.toString());
    }
    LocalDate fecha=LocalDate.of(2024,5,26);
    parqueadero.generarReporteDiario(fecha);

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
    

