package co.edu.uniquindio.poo;

public class Universidad {
    private final String nombre;
    private final Oficina oficina;

    public Universidad(String nombre, Oficina oficina) {
        this.nombre = nombre;
        this.oficina=oficina;
        assert nombre != null && nombre.isBlank();
    }

    public String getNombre() {
        return nombre;
    }

    public Oficina getOficina() {
        return oficina;
    }
    

}
