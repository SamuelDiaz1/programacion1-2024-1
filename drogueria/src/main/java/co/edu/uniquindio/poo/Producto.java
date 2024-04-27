package co.edu.uniquindio.poo;

public  class Producto {
    private final String codigoProducto;
    private final String nombre;
    private final String descripcion;
    private final double precio;
    private int stock;
    private final String proveedor;
    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proveedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getProveedor() {
        return proveedor;
    }
    

    
}
