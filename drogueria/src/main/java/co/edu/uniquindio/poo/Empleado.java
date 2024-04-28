package co.edu.uniquindio.poo;



public class Empleado extends Persona{
    private final double salario;

    public Empleado(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono);
        this.salario = salario;
        assert salario>0:"El salario debe ser mayor a 0";
    }
    public double getSalario() {
        return salario;
    }

    
}
