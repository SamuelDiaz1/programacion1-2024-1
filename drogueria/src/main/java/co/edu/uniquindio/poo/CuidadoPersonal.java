package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto{
    private final String ingredientes;

    public CuidadoPersonal(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor, String ingredientes) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.ingredientes = ingredientes;
        assert ingredientes != null && ingredientes.isBlank();
    }

    public String getIngredientes() {
        return ingredientes;
    }
    
}
