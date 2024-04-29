package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        Collection <Producto> lista = new ArrayList<>();
        Drogueria drogueria= new Drogueria("Drogas", lista);
        Gerente gerente= new Gerente("Rodolfo R", "Hernandes", "101234", "Paraiso 246", "1234567890", 34500);
        Medicina medicina= new Medicina("245", "Gripaldo", "Medicamento para la gripa", 450, 7, "Supermas", 12);
        Medicina medicina1= new Medicina("246", "Gripaldo", "Medicamento para la gripa", 450, 7, "Supermas", 12);
        gerente.agregarProducto(medicina1);
        gerente.agregarProducto(medicina);
        drogueria.agregarEmpleado(gerente);
        System.out.println(lista.toArray().toString());
        

    }
}


