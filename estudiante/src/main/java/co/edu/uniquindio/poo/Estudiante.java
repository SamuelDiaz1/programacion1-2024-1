package co.edu.uniquindio.poo;

public record Estudiante(int id,String nombres, String apellidos,String correo,String telefono, int edad) {
    public Estudiante{
        assert nombres != null :"E1";
        assert apellidos !=null :"E1";
        assert correo!= null && correo.contains("@");
        assert edad > 0;
        assert telefono.length()==10;
    }
}
