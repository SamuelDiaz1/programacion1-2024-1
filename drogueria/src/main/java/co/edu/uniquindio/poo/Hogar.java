package co.edu.uniquindio.poo;

public class Hogar extends Producto{
    private final String indicaciones;

    public Hogar(String codigoProducto, String nombre, String descripcion, double precio, int stock, String proveedor,
            String indicaciones) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);
        this.indicaciones = indicaciones;
        assert indicaciones != null && indicaciones.isBlank():"Las indicaciones deben ser diferente de null";
    }

    public String getIndicaciones() {
        return indicaciones;
    }
    

}
