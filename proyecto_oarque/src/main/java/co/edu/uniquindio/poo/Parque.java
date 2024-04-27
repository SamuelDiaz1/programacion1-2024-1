package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Parque {
    private static final Parque[] parques = null;
    private final String nombreParque;
    private final Collection <Zona>zonas;
    private final Municipio municipio;
    public Parque (String nombreParque,Municipio municipio){
        this.nombreParque=nombreParque;
        this.municipio=municipio;
        zonas=new LinkedList<>();
        assert nombreParque!=null && nombreParque.isBlank():"El nombre no puede ser null";
    }
    public String getNombreParque() {
        return nombreParque;
    }
    public Collection<Zona> getZonas() {
        return zonas;
    }
    public Municipio getMunicipio() {
        return municipio;
    }

    public double calcularValorTotal (){
        double valorTotal=0;
        for (Parque parque : parques) {
           for (Zona zona : parque.getZonas()) {
            valorTotal+=zona.getArea()*zona.getMaterial().getCostoMetroCuadrado()+parque.getMunicipio().getSobrecosto();
        }
        }
        return valorTotal;
    }
    public void verificarZonaExiste(){
        
    }
    

}
