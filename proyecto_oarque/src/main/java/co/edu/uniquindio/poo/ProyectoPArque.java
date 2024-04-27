package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;

/**
 *Hello world!
 *
 */
public class ProyectoPArque {
    
    private final String nombreProyectoParque;
    private final Collection<Parque> parques;
    public ProyectoPArque (String nombreParque){
        this.nombreProyectoParque=nombreParque;
        parques=new LinkedList<>();
        assert nombreParque!= null && nombreParque.isBlank():"El nombre no puede ser null";
    }
    public String getNombreProyectoParque() {
        return nombreProyectoParque;
    }
    public Collection<Parque> getParques() {
        return parques;
    }
    public void agregarParque(){
        for (Parque parque : parquesAux) {
            
        }
    }
    


}

