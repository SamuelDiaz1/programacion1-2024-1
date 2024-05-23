package co.edu.uniquindio.poo.model;

//import java.time.LocalDate;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//import java.time.LocalTime;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero("Mi Parqueadero", 2000, 1000, 6, 6);
    
        Vehiculo moto1 = new Moto("ABC123", "Marca1", "Modelo1", 150, TipoMoto.HIBRIDA);
        Vehiculo moto2 = new Moto("XYZ789", "Marca2", "Modelo2", 120, TipoMoto.CLASICA);
    
        Vehiculo carro1 = new Carro("Toyota", "2015", "XGB123");
        Vehiculo carro2 = new Carro("Mazda","2009","MRS189");

    
        parqueadero.asignarVehiculoAPuesto(0, 0, moto1);
        parqueadero.asignarVehiculoAPuesto(2, 2, moto2);
        parqueadero.asignarVehiculoAPuesto(4, 3, carro1);
        parqueadero.asignarVehiculoAPuesto(5, 5, carro2);
    
        // Mostrar un reporte de los vehículos asignados
        System.out.println(parqueadero);
       
        
    
}
    
    }
    

