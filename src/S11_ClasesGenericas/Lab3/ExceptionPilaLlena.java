package S11_ClasesGenericas.Lab3;

public class ExceptionPilaLlena extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExceptionPilaLlena() {
        this("Pila esta vacia");
    }

    public ExceptionPilaLlena(String mensaje) {
        super(mensaje);
    }
}
