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

        Parqueadero parqueadero= new Parqueadero("Parquecars",1000,500,6,6);
        String[] options = {
                "Registrar Moto clasica",
                "Registrar moto hibrida",
                "Registrar carro",
                "Registrar Salida de Vehículo",
                "Eliminar Vehículo",
                "Verificar Disponibilidad de Puesto",
                "",
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

                    String marca1 = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
                    String placa1 = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo1= JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String nombrePropietario1 = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                    String cedulaPropietario1 = JOptionPane.showInputDialog("Ingrese la cedula del propietario:");
                    int velocidadMaxima1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la velocidad maxima de la moto:"));
                    int i1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                    int j1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));

                    Propietario propietario1 = new Propietario(nombrePropietario1, cedulaPropietario1);

                    Vehiculo motoClasica = new Moto(propietario1, marca1,modelo1, placa1, velocidadMaxima1,TipoMoto.CLASICA);

                    LocalDate fechaIngresoMotoClasica= LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha (yyyy-MM-dd):"));
                    LocalTime horaIngresoMotoClasica= LocalTime.parse(JOptionPane.showInputDialog(null,"Ingrese la hora (HH:mm):"));
                    Registro registroMotoClasica=new Registro(motoClasica,horaIngresoMotoClasica,fechaIngresoMotoClasica);
                    parqueadero.asignarVehiculoAPuesto(i1,j1,registroMotoClasica);
                    parqueadero.registrarVehiculo(motoClasica);

            break;
            case 1:
                String marcaMotoHibrida = JOptionPane.showInputDialog("Ingrese la marca de la moto:");
                String placaMotoHibrida = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                String modeloMotoHibrida = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                String nombrePropietarioMotoHibrida= JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                String cedulaPropietarioMotoHibrida= JOptionPane.showInputDialog("Ingrese la cedula del propietario:");
                int velocidadMaximaMotoHibrida= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ingrese la velocidad maxima de la moto:"));
                Propietario propietarioMotoHibrida = new Propietario(nombrePropietarioMotoHibrida, cedulaPropietarioMotoHibrida);
                int i2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                int j2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));

                Vehiculo motoH = new Moto(propietarioMotoHibrida, marcaMotoHibrida,modeloMotoHibrida, placaMotoHibrida, velocidadMaximaMotoHibrida,TipoMoto.HIBRIDA);

                parqueadero.registrarVehiculo(motoH);
                Registro registroMotoH=new Registro(motoH,LocalTime.now(),LocalDate.now());
                parqueadero.asignarVehiculoAPuesto(i2,j2,registroMotoH);
                parqueadero.registrarVehiculo(motoH);
                JOptionPane.showMessageDialog(null,"Moto hibrida registrada");

                break;
            case 2:
                String marcaCarro = JOptionPane.showInputDialog("Ingrese la marca del carro:");
                String placaCarro = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                String modeloCarro = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                String nombrePropietarioCarro = JOptionPane.showInputDialog("Ingrese el nombre del propietario:");
                String cedulaPropietarioCarro= JOptionPane.showInputDialog("Ingrese la cedula del propietario:");
                Propietario propietarioCarro = new Propietario(nombrePropietarioCarro, cedulaPropietarioCarro);
                int i3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada I:"));
                int j3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la coordenada J:"));
                Vehiculo carro = new Carro(propietarioCarro, marcaCarro,modeloCarro, placaCarro);
                LocalDate fechaIngresoCarro= LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha (yyyy-MM-dd):"));
                LocalTime horaIngresoCarro= LocalTime.parse(JOptionPane.showInputDialog(null,"Ingrese la hora (HH:mm):"));
                Registro registroCarro=new Registro(carro,horaIngresoCarro,fechaIngresoCarro);
                parqueadero.asignarVehiculoAPuesto(i3,j3,registroCarro);
                parqueadero.registrarVehiculo(carro);
                JOptionPane.showMessageDialog(null,"Carro registrado");


                break;
            case 3:

            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                JOptionPane.showMessageDialog(null, parqueadero.toString());
            case 8:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
        } while (choice != 8);
    }







    
        // Mostrar un reporte de los vehículos asignados
    
       
        
    
}
    

    

