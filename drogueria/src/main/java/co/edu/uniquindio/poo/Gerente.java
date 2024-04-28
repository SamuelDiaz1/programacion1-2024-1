package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Gerente extends Empleado {

    public Gerente(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono, salario);
        //TODO Auto-generated constructor stub
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
    public void eliminarProducto(String codigoProducto){
        
    }

}
