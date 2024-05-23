package co.edu.uniquindio.poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CentroImpresion {
    private final String nombre;
    private ArrayList<Publicacion> publicaciones;
    private Impresora impresoraConectada;

    public CentroImpresion(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the publicaciones
     */
    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    /**
     * @param publicaciones the publicaciones to set
     */
    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    /**
     * @return the impresoraConectada
     */
    public Impresora getImpresoraConectada() {
        return impresoraConectada;
    }

    /**
     * @param impresoraConectada the impresoraConectada to set
     */
    public void setImpresoraConectada(Impresora impresoraConectada) {
        this.impresoraConectada = impresoraConectada;
    }

    public void conectarImpresora(Impresora impresora){
        setImpresoraConectada(impresora);
        impresora.conectarImpresora();
    }
    public void desconectarImpresora( ){
        getImpresoraConectada().desconectarImpresora();
        setImpresoraConectada(null);
        
    }
    public void imprimirPublicacion(Publicacion publicacion){
        if(verificarConexionImpresora()){
            getImpresoraConectada().imprimir(publicacion);
        }else{
            JOptionPane.showMessageDialog(null,"No sea bestia no hay impresoras");
        }
    }

    public boolean verificarConexionImpresora(){
       return getImpresoraConectada() != null  && getImpresoraConectada().getEstadoImpresora() == EstadoImpresora.CONECTADA;
    }
}
