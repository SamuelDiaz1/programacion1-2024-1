package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Drogueria {
    private final String nombre;
    private final Collection <Producto> listaProductos;

    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.listaProductos=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    public boolean verificarCodigoProductoExiste(String codigoProducto){
        boolean existe= false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                existe=true;
            }
        }
        return existe;
        
      
    }
    public void agregarProucto(Producto producto){
        assert( verificarCodigoProductoExiste(producto.getCodigoProducto())==false):"El producto ya existe";
            listaProductos.add(producto);
        

    }
    
}
