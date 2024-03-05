package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Veterinaria {
    public  String nombre;
    public Collection <Mascota> mascotas;
    public Veterinaria(String nombre){
        assert nombre != null && nombre.isBlank();
        mascotas=new LinkedList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarMascota(Mascota mascota){
        assert validarIdExiste(mascota.id())==false;
        mascotas.add(mascota);

    }
    public Mascota getMascota(String id){
        Mascota mascotaInteres= null;
        for(Mascota mascota :mascotas){
            if(mascota.id().equals(id)){
                mascota=mascotaInteres;

            }
        }
        return (mascotaInteres);
}    

    public Collection<Mascota> getMascotas(){
        return Collections.unmodifiableCollection(mascotas);
    }
    private boolean validarIdExiste (String id){
        boolean existe=false;
        for(Mascota mascota :mascotas){
            if(mascota.id().equals(id)){
                existe= true;
            }
        }
        return existe;
    }

}
