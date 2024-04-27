package co.edu.uniquindio.poo;

public class Zona {
    private final String nombreZona;
    private final Material material;
    private final double area;
    public Zona (String nombreZona,double area,Material material){
        this.nombreZona=nombreZona;
        this.material=material;
        this.area=area;
        
        assert nombreZona !=null && nombreZona.isBlank():"El nombre debe ser diferente de null";
    }
    public String getNombreZona() {
        return nombreZona;
    }
    public Material getMaterial() {
        return material;
    }
    public double getArea(){

        return area;

    }
}
