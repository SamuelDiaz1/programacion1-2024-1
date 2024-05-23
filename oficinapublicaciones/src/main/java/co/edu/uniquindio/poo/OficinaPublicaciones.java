package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicaciones {

    private final String nombre;

    private EquipoElectronico[] listaEquiposElectronicos;
    private CentroImpresion centroImpresion;
    private ArrayList<Publicacion> solicitudes;
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the listaEquiposElectronicos
     */
    public EquipoElectronico[] getListaEquiposElectronicos() {
        return listaEquiposElectronicos;
    }

    /**
     * @param listaEquiposElectronicos the listaEquiposElectronicos to set
     */
    public void setListaEquiposElectronicos(EquipoElectronico[] listaEquiposElectronicos) {
        this.listaEquiposElectronicos = listaEquiposElectronicos;
    }

    /**
     * @return the centroImpresion
     */
    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }

    /**
     * @param centroImpresion the centroImpresion to set
     */
    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }

    /**
     * @return the solicitudes
     */
    public ArrayList<Publicacion> getSolicitudes() {
        return solicitudes;
    }

    /**
     * @param solicitudes the solicitudes to set
     */
    public void setSolicitudes(ArrayList<Publicacion> solicitudes) {
        this.solicitudes = solicitudes;
    }

    /**
     * @param nombre
     * @param listaEquiposElectronicos
     * @param centroImpresion
     * @param solicitudes
     */
    public OficinaPublicaciones(String nombre) {
        this.nombre = nombre;
        this.listaEquiposElectronicos = new EquipoElectronico[5];
        this.centroImpresion = new CentroImpresion("El centro de impresion");
        this.solicitudes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OficinaPublicaciones [nombre=" + nombre + ", listaEquiposElectronicos="
                + Arrays.toString(listaEquiposElectronicos) + ", centroImpresion=" + centroImpresion + ", solicitudes="
                + solicitudes + "]";
    }

   
    public void imprimirPublicacion(Publicacion publicacion){

        if(getCentroImpresion() != null){
            getCentroImpresion().imprimirPublicacion(publicacion);
        }
    }





}
