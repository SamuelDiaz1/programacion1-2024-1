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

        Parqueadero parqueadero = new Parqueadero("Parquecars", 1000, 500, 6, 6);

        String menu = "Seleccione una opción:\n" +
                "1. Registrar Moto Clásica\n" +
                "2. Registrar Moto Híbrida\n" +
                "3. Registrar Carro\n" +
                "4. Registrar Salida de Vehículo\n" +
                "5. Verificar Disponibilidad de Puesto\n" +
                "6. Generar Reporte Diario\n" +
                "7. Generar Reporte Mensual\n" +
                "8. Mostrar Estado del Parqueadero\n" +
                "9. Mostrar informacion del propietario ingresando un puesto\n"+
                "10. Salir";

        int choice;

        do {
            String opcion = JOptionPane.showInputDialog(menu);
            if (opcion == null) {
                break; // Si el usuario cancela, se sale del bucle
            }
            choice = Integer.parseInt(opcion);

            switch (choice) {
                case 1:
                    String marca1 = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
                    String placa1 = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo1 = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String nombrePropietario1 = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                    String cedulaPropietario1 = JOptionPane.showInputDialog("Ingrese la cédula del propietario:");
                    int velocidadMaxima1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad máxima de la moto:"));
                    int i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));

                    Propietario propietario1 = new Propietario(nombrePropietario1, cedulaPropietario1);
                    Vehiculo motoClasica = new Moto(propietario1, marca1, modelo1, placa1, velocidadMaxima1, TipoMoto.CLASICA);
                    LocalDate fechaIngresoMotoClasica = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha (yyyy-MM-dd):"));
                    LocalTime horaIngresoMotoClasica = LocalTime.parse(JOptionPane.showInputDialog(null, "Ingrese la hora (HH:mm):"));
                    Registro registroMotoClasica = new Registro(motoClasica, horaIngresoMotoClasica, fechaIngresoMotoClasica);
                    parqueadero.asignarVehiculoAPuesto(i1, j1, registroMotoClasica);
                    parqueadero.registrarVehiculo(motoClasica);
                    JOptionPane.showMessageDialog(null, "Moto clásica registrada");
                    break;

                case 2:
                    String marcaMotoHibrida = JOptionPane.showInputDialog("Ingrese la marca de la moto:");
                    String placaMotoHibrida = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modeloMotoHibrida = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String nombrePropietarioMotoHibrida = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                    String cedulaPropietarioMotoHibrida = JOptionPane.showInputDialog("Ingrese la cédula del propietario:");
                    int velocidadMaximaMotoHibrida = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad máxima de la moto:"));
                    Propietario propietarioMotoHibrida = new Propietario(nombrePropietarioMotoHibrida, cedulaPropietarioMotoHibrida);
                    int i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));
                    LocalDate fechaIngresoMotoH = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha (yyyy-MM-dd):"));
                    LocalTime horaIngresoMotoH = LocalTime.parse(JOptionPane.showInputDialog(null, "Ingrese la hora (HH:mm):"));

                    Vehiculo motoH = new Moto(propietarioMotoHibrida, marcaMotoHibrida, modeloMotoHibrida, placaMotoHibrida, velocidadMaximaMotoHibrida, TipoMoto.HIBRIDA);
                    parqueadero.registrarVehiculo(motoH);
                    Registro registroMotoH = new Registro(motoH, horaIngresoMotoH, fechaIngresoMotoH);
                    parqueadero.asignarVehiculoAPuesto(i2, j2, registroMotoH);
                    JOptionPane.showMessageDialog(null, "Moto híbrida registrada");
                    break;

                case 3:
                    String marcaCarro = JOptionPane.showInputDialog("Ingrese la marca del carro:");
                    String placaCarro = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modeloCarro = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String nombrePropietarioCarro = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                    String cedulaPropietarioCarro = JOptionPane.showInputDialog("Ingrese la cédula del propietario:");
                    Propietario propietarioCarro = new Propietario(nombrePropietarioCarro, cedulaPropietarioCarro);
                    int i3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));
                    Vehiculo carro = new Carro(propietarioCarro, marcaCarro, modeloCarro, placaCarro);
                    LocalDate fechaIngresoCarro = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha (yyyy-MM-dd):"));
                    LocalTime horaIngresoCarro = LocalTime.parse(JOptionPane.showInputDialog(null, "Ingrese la hora (HH:mm):"));
                    Registro registroCarro = new Registro(carro, horaIngresoCarro, fechaIngresoCarro);
                    parqueadero.asignarVehiculoAPuesto(i3, j3, registroCarro);
                    parqueadero.registrarVehiculo(carro);
                    JOptionPane.showMessageDialog(null, "Carro registrado");
                    break;

                case 4:
                    int i4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));
                    parqueadero.liberarPuesto(i4, j4);
                    JOptionPane.showMessageDialog(null, "El puesto (" + i4 + ", " + j4 + ") fue liberado");
                    break;

                case 5:
                    int i5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada I del puesto:"));
                    int j5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada J del puesto:"));
                    boolean disponible = parqueadero.isPuestoDisponible(i5, j5);
                    JOptionPane.showMessageDialog(null, "El puesto en (" + i5 + ", " + j5 + ") está " +
                            (disponible ? "disponible." : "ocupado."));
                    break;

                case 6:
                    LocalDate fechaReporte = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese la fecha de la cual quiere generar el reporte (YYYY-MM-DD):"));
                    parqueadero.generarReporteDiario(fechaReporte);
                    break;

                case 7:
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes del reporte (1-12):"));
                    int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del reporte (YYYY):"));
                    parqueadero.generarReporteMensual(mes, anio);
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, parqueadero.toString());
                    break;
                case 9:
                    int i6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));

                    parqueadero.retornarPropietario(i6,j6);
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (choice != 10);
    }
}
