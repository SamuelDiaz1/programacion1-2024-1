package co.edu.uniquindio.poo;

public abstract class Persona {
    private final String nombres;
    private final String apellidos;
    private final String dni;
    private final String direccion;
    private final String telefono;
    public Persona(String nombres, String apellidos, String dni, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        assert nombres != null && nombres.isBlank():"Los nombres debe ser diferente de null";
        assert apellidos != null && apellidos.isBlank():"Los apellidos deben ser diferentes de null";
        assert dni != null && dni.isBlank():"El dni debe ser diferente de null";
        assert direccion != null && direccion.isBlank():"La dirección debe ser diferente de null";
        assert telefono != null && telefono.isBlank():"El telefeno debe ser diferente de null";
        assert telefono.length()==10:"El telefono debe tener 10 digitos";
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    

}
