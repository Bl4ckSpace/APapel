package colaDatos;

import java.util.Optional;

public interface Cola<T> {

    // Agrega un elemento al final de la cola
    void encolar(T elemento);

    // Elimina y devuelve el primer elemento (FIFO)
    Optional<T> desencolar();

    // Devuelve el primer elemento sin eliminarlo
    Optional<T> verPrimero();

    // Verifica si la cola está vacía
    boolean estaVacia();

    // Devuelve el tamaño de la cola
    int tamano();

    // Limpia toda la cola
    void limpiar();
}
