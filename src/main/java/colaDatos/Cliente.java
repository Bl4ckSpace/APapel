package colaDatos;

public class Cliente {
    private int numCliente;
    private String nombre;

    public Cliente(int numCliente, String nombre) {
        this.numCliente = numCliente;
        this.nombre = nombre;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }
}
