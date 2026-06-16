package colaDatos;

public class Principal {
 public static void main(String[] args) {

        // Cola de Strings
        Cola<String> colaNombres = new ColaImplementada<>();
        colaNombres.encolar("Ana");
        colaNombres.encolar("Carlos");
        System.out.println(colaNombres.desencolar()); // Optional[Ana]

        // Cola de Números enteros
        Cola<Integer> colaNumeros = new ColaImplementada<>();
        colaNumeros.encolar(100);
        colaNumeros.encolar(200);
        System.out.println(colaNumeros.verPrimero()); // Optional[100]

        // Cola de objetos personalizados
        Cola<Cliente> colaClientes = new ColaImplementada<>();
        colaClientes.encolar(new Cliente(1, "Luis"));
        colaClientes.encolar(new Cliente(2, "María"));
    }
}
