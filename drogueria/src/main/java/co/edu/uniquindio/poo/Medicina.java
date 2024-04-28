package co.edu.uniquindio.poo;

public class Medicina extends Producto{
    private final double dosis;

    public Medicina(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor, double dosis) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.dosis = dosis;
        assert dosis >0:"La dosis debe ser mayor a 0";
    }

    public double getDosis() {
        return dosis;
    }
    
    

}
