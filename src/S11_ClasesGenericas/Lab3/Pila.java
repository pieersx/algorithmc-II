package S11_ClasesGenericas.Lab3;

public class Pila<E> {
    private final int longitud;
    private int superior;
    private E[] elementos;

    public Pila() {
        this(10);
    }

    public Pila(int longitud) {
        this.longitud = longitud > 0 ? longitud : 10;
        this.superior = -1;
        elementos = (E[]) new Object[longitud];
    }

    public void push(E valorAMeter) {
        if (superior == longitud - 1) {
            throw new ExceptionPilaLlena(String.format("La Pila esta llena, no se puede meter %s", valorAMeter));
        }

        elementos[++superior] = valorAMeter;
    }

    public E pop() {
        if (superior == -1) {
            throw new ExceptionPilaVacia("La Pila esta vacia, no se puede sacar");
        }

        return elementos[superior--];
    }
}
