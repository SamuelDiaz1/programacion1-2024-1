package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.temporal.ChronoUnit;
import java.util.Collection;
//import java.util.HashMap;
import java.util.LinkedList;
//import java.util.Map;

public class Parqueadero {
    private final String nombre;
    private final Collection<Puesto> listaPuestos;
    private final int tarifaHoraCarro;
    private final int tarifaHoraMoto;
    private final Collection<Vehiculo> vehiculos;
    private final Collection<Registro> registros;
    private final Puesto[][] puestos;
    private final int filas;
    private final int columnas;
    //private final Map<Vehiculo, LocalDate> vehiculosIngresados;


    public Parqueadero(String nombre, int tarifaHoraCarro, int tarifaHoraMoto, int filas, int columnas) {
        this.nombre = nombre;
        this.listaPuestos = new LinkedList<>();
        this.tarifaHoraCarro = tarifaHoraCarro;
        this.tarifaHoraMoto = tarifaHoraMoto;
        this.vehiculos = new LinkedList<>();
        this.registros = new LinkedList<>();
        this.puestos = new Puesto[filas][columnas];
        this.filas= filas;
        this.columnas= columnas;
        //this.vehiculosIngresados = new HashMap<>();

        inicializarPuestos();
        assert nombre != null && nombre.isBlank() : "El nombre debe ser diferente de null";
        assert tarifaHoraMoto > 0 : "La tarifa de la moto debe ser mayor a 0";
        assert tarifaHoraCarro > 0 : "La tarifa de la moto  debe ser mayor a 0";
    }

    public Puesto[][] getPuestos() {
        return puestos;
    }


    public String getNombre() {
        return nombre;
    }

    public Collection<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public int getTarifaHoraCarro() {
        return tarifaHoraCarro;
    }

    public int getTarifaHoraMoto() {
        return tarifaHoraMoto;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Collection<Registro> getRegistros() {
        return registros;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                Puesto puesto = puestos[i][j];
                if (puesto.isOcupado()) {
                    sb.append("[Ocupado] ");
                } else {
                    sb.append("[Desocupado] ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }


        /**
         * Inicializa todos los puestos del parqueadero.
         * Crea un objeto Puesto para cada posición en la matriz de puestos.
         * Cada puesto se inicializa con las coordenadas correspondientes.
         */
        private void inicializarPuestos() {
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= columnas; j++) {
                    Puesto puesto = new Puesto(i, j);
                    listaPuestos.add(puesto);
                    puestos[i - 1][j - 1] = puesto;
                }
            }
        }
/**
 * Asigna un vehículo a un puesto específico en el parqueadero.
 * Verifica si el puesto está disponible y dentro de los límites del parqueadero.
 * Si el puesto está disponible, asigna el vehículo al puesto y lo marca como ocupado.
 * @param coordenadaI La coordenada 'i' (fila) del puesto en el parqueadero.
 * @param coordenadaJ La coordenada 'j' (columna) del puesto en el parqueadero.
 * @param vehiculo El vehículo que se va a asignar al puesto.
 * */
    public void asignarVehiculoAPuesto(int coordenadaI, int coordenadaJ, Vehiculo vehiculo) {
        Puesto puesto = getPuesto(coordenadaI, coordenadaJ);
        if (puesto != null) {
            if (!puesto.isOcupado()) {
                puesto.setVehiculo(vehiculo);
                vehiculos.add(vehiculo);
                System.out.println("Vehículo asignado al puesto en coordenadas (" + coordenadaI + ", " + coordenadaJ + ")");
            } else {
                System.out.println(("El vehiculo "+vehiculo.getPlaca())+ " no puede ocupar el puesto (" + coordenadaI + ", " + coordenadaJ+ ") porque está ocupado.");
                System.out.println();
            }
        } else {
        System.out.println("Las coordenadas (" + coordenadaI + ", " + coordenadaJ + ") no existen en el parqueadero.");
    }
}
   public Puesto getPuesto ( int coordenadaI, int coordenadaJ){
        for (Puesto puesto : listaPuestos) {
            if (puesto.getCoordenadaI() == coordenadaI && puesto.getCoordenadaJ() == coordenadaJ) {
                    return puesto;
                }
            }
            return null; // Si no se encuentra el puesto, devolvemos null
        }
        public double calcularValorPorVehiculo(Registro registro) {
            long horasEstacionado = registro.calcularHorasEstacionado();
            double tarifa = 0;
            Vehiculo vehiculo = registro.getVehiculo();
            
            if (vehiculo instanceof Moto) {
                tarifa = tarifaHoraMoto * horasEstacionado;
            } 
            else {
                tarifa = tarifaHoraCarro * horasEstacionado;
            }

             return tarifa;
        }

    /**
     * @param fecha la fecha de la cual se busca generar el reporte 
     * De acuerdo a una fecha dada imprime el reporte con registro de entrada y salida
     * valor a pagar de un auto
     * cantidadd de vehiculos ingresados en el dia
     * y el total de dinero recogido durante el dia 
     **/

    
    public void generarReporteDiario(LocalDate fecha) {
        double totalRecaudado = 0.0;
        int cantidadVehiculos = 0;
    
        System.out.println("Reporte Diario - Fecha: " + fecha);
       // System.out.println("--------------------------------------------------");
        for (Registro registro : registros) {
            if (registro.getFechaIngreso().equals(fecha)) {
                cantidadVehiculos++;
                totalRecaudado += calcularValorPorVehiculo(registro);
                System.out.println("Vehículo " + registro.getVehiculo().getPlaca() +
                        " - Hora de ingreso: " + registro.getHoraIngreso() +
                        " - Hora de salida: " + registro.getHoraSalida() +
                        " - Valor a pagar: $" + calcularValorPorVehiculo(registro));
            }
        }
        System.out.println("Total vehículos: " + cantidadVehiculos);
        System.out.println("Total recaudado: $" + totalRecaudado);
        //System.out.println("--------------------------------------------------");
    }
    /**
     * @param  mes mes que del que se desea generar el reporte
     * @param anio año del cual se busca generar el reporte del mes
     * Al ingresar el dia y año se recorren la fecha de los registros, las fechas que tengan el año y mes ingresados
     * como parametros 
     * 
     * 
     * 
     **/
    public void generarReporteMensual(int mes, int anio) {
        double totalRecaudado = 0.0;
        int cantidadVehiculos = 0;
    
        System.out.println("Reporte Mensual - Mes: " + mes + " - Año: " + anio);
       // System.out.println("--------------------------------------------------");
        for (Registro registro : registros) {
            if (registro.getFechaIngreso().getMonthValue() == mes && registro.getFechaIngreso().getYear() == anio) {
                cantidadVehiculos++;
                double valorPagar = calcularValorPorVehiculo(registro);
                totalRecaudado += valorPagar;
                System.out.println("Vehículo " + registro.getVehiculo().getPlaca() +
                        " - Fecha de ingreso: " + registro.getFechaIngreso() +
                        " - Hora de ingreso: " + registro.getHoraIngreso() +
                        " - Hora de salida: " + registro.getHoraSalida() +
                        " - Valor a pagar: $" + valorPagar);
            }
        }
        System.out.println("Total vehículos: " + cantidadVehiculos);
        System.out.println("Total recaudado: $" + totalRecaudado);
        //System.out.println("--------------------------------------------------");
    }
}