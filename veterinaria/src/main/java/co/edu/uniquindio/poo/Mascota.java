package co.edu.uniquindio.poo;



public record Mascota(String id,String nombre, String especie, String raza,int edad, String genero, String color, double peso) {
    public Mascota{
        assert nombre != null && !nombre.isBlank() : "El nombre debe ser diferente de null";
        assert especie != null && !especie.isBlank() : "La especie debe ser diferente de null";
        assert raza != null && !raza.isBlank()   : "El número de identificación debe ser diferente de null";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert color != null && color.isBlank() :"El color debe ser diferente de null";
        assert genero != null && genero.isBlank(): "El genero no puede ser null";
        assert peso > 0 :"El peso debe ser mayor a 0";
    }
}

