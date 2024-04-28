package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
        Drogueria drogueria= new Drogueria("Drogas");
        Gerente gerente= new Gerente("Rodolfo R", "Hernandes", "101234", "Paraiso 246", "1234567890", 34500);
        Medicina medicina= new Medicina("245", "Gripaldo", "Medicamento para la gripa", 450, 7, "Supermas", 12);
        gerente.agregarProducto(medicina);
        drogueria.agregarEmpleado(gerente);
        System.out.println(drogueria.getListaProductos()); 

    }
}
