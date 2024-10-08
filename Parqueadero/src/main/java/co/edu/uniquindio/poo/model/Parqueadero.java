package co.edu.uniquindio.poo.model;


import javax.swing.*;
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
    private final Collection <Vehiculo>vehiculosAux;
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
        this.vehiculosAux = new LinkedList<>();
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

    public Collection<Vehiculo> getVehiculosAux() {return vehiculosAux;}

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


    /**
     * Obtiene un vehículo en el parqueadero dado su número de placa.
     * @param placa La placa del vehículo a buscar.
     * @return El vehículo encontrado o null si no se encuentra.
     */
    public Vehiculo obtenerVehiculo (String placa){
         for (Vehiculo vehiculo : vehiculos){
             if( vehiculo.getPlaca().equals(placa)){
                 return vehiculo; 
             }
         }
        System.out.println("El vehiculo no se encontro" + placa);
         return null; 
    }
    /**
     * Verifica si un vehículo con una placa específica existe en el parqueadero.
     * @param placa La placa del vehículo a buscar.
     * @return true si el vehículo existe, false en caso contrario.
     */
    public boolean existeVehiculo (String placa){
        return obtenerVehiculo(placa) != null;
    }
    /**
     * Registra un vehículo en el parqueadero.
     * @param vehiculo El vehículo a registrar.
     */
    public void registrarVehiculo (Vehiculo vehiculo){
        if (vehiculo != null && !existeVehiculo(vehiculo.getPlaca())){
            vehiculos.add(vehiculo);
            vehiculosAux.add(vehiculo);
            System.out.println("Vehiculo agregado: "+ vehiculo.getPlaca());

        }
        else{
            System.out.println("No fue posilbe agregar el vehiculo");
        }

    }
    /**
     * Verifica si un puesto específico en el parqueadero está disponible.
     * @param coordenadaI La coordenada 'i' (fila) del puesto en el parqueadero.
     * @param coordenadaJ La coordenada 'j' (columna) del puesto en el parqueadero.
     * @return true si el puesto está disponible, false en caso contrario.
     */
    public boolean isPuestoDisponible(int coordenadaI, int coordenadaJ) {
        Puesto puesto = getPuesto(coordenadaI, coordenadaJ);
        return puesto != null && !puesto.isOcupado();
    }
    /**
     * Registra la salida de un vehículo del parqueadero.
     * @param vehiculo El vehículo que va a salir del parqueadero.
     */
    public void registrarSalidaVehiculo(Vehiculo vehiculo) {
        for (Registro registro : registros) {
            if (registro.getVehiculo().equals(vehiculo) && registro.getFechaSalida() == null) {
                registro.registrarSalidaVehiculo();
                double valorPagar = calcularValorPorVehiculo(registro);
                vehiculosAux.remove(vehiculo);
                System.out.println("Valor a pagar: $" + valorPagar);
                break;
            }
        }
    }
    /**
     * Elimina un vehículo del parqueadero dado su número de placa.
     * @param placa La placa del vehículo a eliminar.
     */
    public void eliminarVehiculo (String placa){
        Vehiculo vehiculo = obtenerVehiculo(placa);
        if (vehiculo!= null ){
            vehiculos.remove(vehiculo);
            System.out.println("Vehiculo eliminado: "+ placa);
        }
        else {
            System.out.println("No fue posible elminar el vehiculo: " +placa);
        }
        
    }
    /**
     * Representa el estado actual del parqueadero en forma de cadena.
     * Muestra si cada puesto está ocupado o desocupado.
     * @return Una cadena que representa el estado del parqueadero.
     */
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
     * @param registro El registro del vehículo que se va a asignar al puesto.
     */
    public void asignarVehiculoAPuesto(int coordenadaI, int coordenadaJ, Registro registro) {
        if (vehiculosAux.contains(registro.getVehiculo())) {
            System.out.println("Error: El vehículo ya está asignado a otro puesto.");

        }
        if (isPuestoDisponible(coordenadaI, coordenadaJ)) {
            Puesto puesto = getPuesto(coordenadaI, coordenadaJ);
            puesto.setVehiculo(registro.getVehiculo());
            vehiculos.add(registro.getVehiculo());
            vehiculosAux.add(registro.getVehiculo());

            registros.add(registro);
            System.out.println("Vehículo asignado al puesto en coordenadas (" + coordenadaI + ", " + coordenadaJ + ")");
        } else {
            System.out.println("El puesto en coordenadas (" + coordenadaI + ", " + coordenadaJ + ") no está disponible.");
        }
    }
    /**
     * Retorna el propietario del vehículo en un puesto específico del parqueadero.
     * @param i La coordenada 'i' (fila) del puesto en el parqueadero.
     * @param j La coordenada 'j' (columna) del puesto en el parqueadero.
     * @return El propietario del vehículo en el puesto, o null si el puesto está vacío.
     */
    public Propietario retornarPropietario(int i,int j){
        Puesto puesto = getPuesto(i,j);
        if (puesto != null && puesto.isOcupado()) {
            Vehiculo vehiculo = puesto.getVehiculo();
            JOptionPane.showMessageDialog(null,"EL propietario es:"+puesto.getVehiculo().getPropietario());
            return vehiculo.getPropietario();

        }

        return null;

    }
    /**
     * Libera un puesto específico en el parqueadero, permitiendo que un nuevo vehículo pueda ocuparlo.
     * @param coordenadaI La coordenada 'i' (fila) del puesto en el parqueadero.
     * @param coordenadaJ La coordenada 'j' (columna) del puesto en el parqueadero.
     */
    public void liberarPuesto(int coordenadaI, int coordenadaJ) {
        Puesto puesto = getPuesto(coordenadaI, coordenadaJ);
        if (puesto != null && puesto.isOcupado()) {
            Vehiculo vehiculo = puesto.getVehiculo();
            for (Registro registro : registros) {


                    double valorPagar = calcularValorPorVehiculo(registro);
                    JOptionPane.showMessageDialog(null,"Valor a pagar por el vehículo en el puesto (" + coordenadaI + ", " + coordenadaJ + "): $" + valorPagar);
                    break;

            }
            puesto.liberarPuesto();
            System.out.println("Puesto en coordenadas (" + coordenadaI + ", " + coordenadaJ + ") ha sido liberado.");
        } else {
            System.out.println("El puesto en coordenadas (" + coordenadaI + ", " + coordenadaJ + ") no está ocupado o no existe.");
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
            tarifa += tarifaHoraMoto * horasEstacionado;
        } else {
            tarifa += tarifaHoraCarro * horasEstacionado;
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

        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte Diario - Fecha: ").append(fecha).append("\n");
        reporte.append("--------------------------------------------------\n");

        for (Registro registro : registros) {
            if (registro.getFechaIngreso().equals(fecha)) {
                cantidadVehiculos++;
                double valorPagar = calcularValorPorVehiculo(registro);
                totalRecaudado += valorPagar;
                reporte.append("Vehículo ").append(registro.getVehiculo().getPlaca())
                        .append(" - Hora de ingreso: ").append(registro.getHoraIngreso())
                        .append(" - Hora de salida: ").append(registro.getHoraSalida())
                        .append(" - Valor a pagar: $").append(valorPagar).append("\n");
            }
        }

        reporte.append("--------------------------------------------------\n");
        reporte.append("Total vehículos: ").append(cantidadVehiculos).append("\n");
        reporte.append("Total recaudado: $").append(totalRecaudado).append("\n");

        JOptionPane.showMessageDialog(null, reporte.toString(), "Reporte Diario", JOptionPane.INFORMATION_MESSAGE);
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

        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte Mensual - Mes: ").append(mes).append(" - Año: ").append(anio).append("\n");
        reporte.append("--------------------------------------------------\n");

        for (Registro registro : registros) {
            if (registro.getFechaIngreso().getMonthValue() == mes && registro.getFechaIngreso().getYear() == anio) {
                cantidadVehiculos++;
                double valorPagar = calcularValorPorVehiculo(registro);
                totalRecaudado += valorPagar;
                reporte.append("Vehículo ").append(registro.getVehiculo().getPlaca())
                        .append(" - Fecha de ingreso: ").append(registro.getFechaIngreso())
                        .append(" - Hora de ingreso: ").append(registro.getHoraIngreso())
                        .append(" - Hora de salida: ").append(registro.getHoraSalida())
                        .append(" - Valor a pagar: $").append(valorPagar).append("\n");
            }
        }

        reporte.append("--------------------------------------------------\n");
        reporte.append("Total vehículos: ").append(cantidadVehiculos).append("\n");
        reporte.append("Total recaudado: $").append(totalRecaudado).append("\n");

        JOptionPane.showMessageDialog(null, reporte.toString(), "Reporte Mensual", JOptionPane.INFORMATION_MESSAGE);
    }
}
