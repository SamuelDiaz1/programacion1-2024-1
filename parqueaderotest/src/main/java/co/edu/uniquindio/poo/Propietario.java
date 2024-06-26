package co.edu.uniquindio.poo;

public class Propietario {
    private final String nombre;
    private final String cedula;


    public Propietario(String nombre, String cedula) {
       assert nombre!=null && !cedula.isBlank() :"El nombre debe ser diferente de null";
        assert cedula !=null && !cedula.isBlank():"El numero de cedula debe ser diferente de null";

        this.nombre = nombre;

        this.cedula = cedula;
       
    }

    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
