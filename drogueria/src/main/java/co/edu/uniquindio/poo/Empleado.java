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
    
}
