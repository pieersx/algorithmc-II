package S11_ClasesGenericas.Lab3;

public class ExceptionPilaVacia extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExceptionPilaVacia() {
        this("Pila esta vacia");
    }

    public ExceptionPilaVacia(String mensaje) {
        super(mensaje);
    }
}
