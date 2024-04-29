package co.edu.uniquindio.poo;



public class Gerente extends Empleado {
    Drogueria drogueria;

    public Gerente(String nombres, String apellidos, String dni, String direccion, String telefono, double salario) {
        super(nombres, apellidos, dni, direccion, telefono, salario);
        this.drogueria=new Drogueria("",null);
        //TODO Auto-generated constructor stub
    }
        public boolean verificarCodigoProductoExiste(String codigoProducto){
        boolean existe= false;
        for (Producto producto :drogueria.getListaProductos()) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                existe=true;
            }
        }
        return existe;
        
      
    }
    public void agregarProducto(Producto producto){

        if(!verificarCodigoProductoExiste(producto.getCodigoProducto())){
            this.drogueria.getListaProductos().add(producto);
        }
    }
    public void eliminarProducto(Producto producto){
        if (!verificarCodigoProductoExiste(producto.getCodigoProducto())){
            drogueria.getListaProductos().remove(producto);
        }
        
    }

}
