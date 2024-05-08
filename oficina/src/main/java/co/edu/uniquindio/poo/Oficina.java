package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Oficina {
    private final String nombre;
    private final Collection <Publicacion> listaPublicaciones;
    private final Collection <EquipoElectronico>listaEquipoElectronicos;
    private final Collection <CentroImpresion> listaCentroImpresion;

    public Oficina(String nombre) {
        this.nombre = nombre;
        this.listaPublicaciones=new LinkedList<>();
        this.listaEquipoElectronicos=new LinkedList<>();
        this.listaCentroImpresion=new LinkedList<>();
        assert nombre != null && nombre.isBlank();
    }

    public String getNombre() {
        return nombre;
    }
    public Collection<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }
    public Collection<EquipoElectronico> getListaEquipoElectronicos() {
        return listaEquipoElectronicos;
    }
    public Collection<CentroImpresion> getListaCentroImpresion() {
        return listaCentroImpresion;
    }
    public void  produccion(){

    }
    public void edicion(){

    }
    public void distribucion(){

    }
    public void promocion(){

    }

    

    

    
}
