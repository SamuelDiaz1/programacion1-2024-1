package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    private final LocalDate fecha;
    private final int cantidad;
    private final Producto productoPedido;
    
    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        assert cantidad >0: "La cantidad debe ser mayor a 0";
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public Producto getProductoPedido() {
        return productoPedido;
    }
}
