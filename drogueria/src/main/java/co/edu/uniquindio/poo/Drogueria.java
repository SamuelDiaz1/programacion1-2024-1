package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Drogueria {
    private final String nombre;
    protected final Collection <Producto> listaProductos;
    private final Collection <Cliente> listaClientes;
    private final Collection <Pedido> listaPedidos;
    private final Collection <Empleado> listaEmpleados;




    public Drogueria(String nombre, Collection<Producto> listaProductos) {
        this.nombre = nombre;
        this.listaProductos=new LinkedList<>();
        this.listaClientes=new LinkedList<>();
        this.listaPedidos= new LinkedList<>();
        this.listaEmpleados= new LinkedList<>();

        
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    } 
       

    @Override
    public String toString() {
        return "Drogueria [nombre=" + nombre + ", listaProductos=" + listaProductos + ", listaClientes=" + listaClientes
                + ", listaPedidos=" + listaPedidos + ", listaEmpleados=" + listaEmpleados + "]";
    }

    public boolean verificarDniExiste(String dni){
        Collection <Persona> listaPersonas=new LinkedList<>();
        boolean existe= false;
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                existe=true;
            }
        }
        return existe;
    }
    public void agregarCliente(Cliente cliente){
        assert(verificarDniExiste(cliente.getDni())==false):"El cliente ya existe";
        listaClientes.add(cliente);
        
        
    }
    public void agregarEmpleado(Empleado empleado){
        assert(verificarDniExiste(empleado.getDni())==true):"El empleado ya existe";
        listaEmpleados.add(empleado);
    }
    public void agregarPedido (Pedido pedido){
        listaPedidos.add(pedido);
    }


    public void agregarProducto(Producto producto) {

    }
}