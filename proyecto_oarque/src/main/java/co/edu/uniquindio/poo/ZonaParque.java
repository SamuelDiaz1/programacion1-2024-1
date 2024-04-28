package co.edu.uniquindio.poo;


public class ZonaParque {

    private final String nombre;
    private final FiguraGeometrica forma;
    private final Material material;

    
    public ZonaParque(String nombre, FiguraGeometrica forma, Material material) {
        this.nombre = nombre;
        this.forma = forma;
        this.material = material;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public FiguraGeometrica getForma() {
        return forma;
    }

    
    public Material getMaterial() {
        return material;
    }

    
    public double calcularValor() {
        return forma.calcularArea() * material.getValorMetroCuadrado();
    }

}
