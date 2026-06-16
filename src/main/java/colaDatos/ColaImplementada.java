package colaDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ColaImplementada<T> implements Cola<T> {

    // Propiedad principal: lista que almacena los elementos
    private List<T> elementos;

    public ColaImplementada() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void encolar(T elemento) {
        // Se añade por el FINAL
        this.elementos.add(elemento);
    }

    @Override
    public Optional<T> desencolar() {
        if (this.estaVacia()) {
            return Optional.empty();
        }
        // Se elimina por el PRINCIPIO (índice 0)
        T elemento = this.elementos.removeFirst();
        return Optional.of(elemento);
    }

    @Override
    public Optional<T> verPrimero() {
        if (this.estaVacia()) {
            return Optional.empty();
        }
        return Optional.of(this.elementos.getFirst());
    }

    @Override
    public boolean estaVacia() {
        return this.elementos.isEmpty();
    }

    @Override
    public int tamano() {
        return this.elementos.size();
    }

    @Override
    public void limpiar() {
        this.elementos.clear();
    }
}
