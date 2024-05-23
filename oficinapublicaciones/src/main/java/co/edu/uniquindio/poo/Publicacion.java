package co.edu.uniquindio.poo;

public class Publicacion {

    private String titulo;
    private String texto;
    private String estado;
    private TipoPublicacion tipoPublicacion;
   
   
    /**
     * @param titulo
     * @param texto
     * @param estado
     * @param tipoPublicacion
     */
    public Publicacion(String titulo, String texto, String estado, TipoPublicacion tipoPublicacion) {
        this.titulo = titulo;
        this.texto = texto;
        this.estado = estado;
        this.tipoPublicacion = tipoPublicacion;
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }
    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * @return the tipoPublicacion
     */
    public TipoPublicacion getTipoPublicacion() {
        return tipoPublicacion;
    }
    /**
     * @param tipoPublicacion the tipoPublicacion to set
     */
    public void setTipoPublicacion(TipoPublicacion tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }




}
