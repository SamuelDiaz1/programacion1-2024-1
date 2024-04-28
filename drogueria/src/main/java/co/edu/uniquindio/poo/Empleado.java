package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

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
    public boolean verificarCodigoProductoExiste(String codigoProducto){
        Collection <Producto> listaProductos =new LinkedList<>();
        boolean existe= false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                existe=true;
            }
        }
        return existe;
        
      
    }
    public void agregarProducto(Producto producto){
        Drogueria drogueria= new Drogueria(getNombres());
        assert( verificarCodigoProductoExiste(producto.getCodigoProducto())==false):"El producto ya existe";
        drogueria.getListaProductos().add(producto);
        

    }
    public static void main(String[] args) {
        Drogueria drogueria= new Drogueria("Drogas");
        Gerente gerente= new Gerente("Rodolfo R", "Hernandes", "101234", "Paraiso 246", "1234567890", 34500);
        Medicina medicina= new Medicina("245", "Gripaldo", "Medicamento para la gripa", 450, 7, "Supermas", 12);
        gerente.agregarProducto(medicina);
        drogueria.agregarEmpleado(gerente);
        System.out.println(drogueria.getListaProductos()); 

    }
}
