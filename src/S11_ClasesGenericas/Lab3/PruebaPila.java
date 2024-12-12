package S11_ClasesGenericas.Lab3;

public class PruebaPila {
    private double[] elementosDouble = {1.1, 2.2, 3.3, 4.4, 5.5};
    private int[] elementosInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Pila<Double> pilaDouble;
    private Pila<Integer> pilaInteger;

    public void pruebaPilas() {
        pilaDouble = new Pila<Double>(5);
        pilaInteger = new Pila<Integer>(10);

        pruebaPushDouble();
        pruebaPopDouble();
        pruebaPushInterger();
        pruebaPopInteger();
    }

    public void pruebaPushDouble() {
        try {
            System.out.println("\n Metiendo elementos en Pila Double");
            for (double elemento: elementosDouble) {
                System.out.printf("%.1f ", elemento);
                pilaDouble.push(elemento);
            }
        } catch (ExceptionPilaLlena e) {
            System.err.println();
            e.printStackTrace();
        }
    }

    public void pruebaPopDouble() {
        try {
            System.out.println("\n Sacando elementos de pila Double");
            double valorASacar;

            while (true) {
                valorASacar = pilaDouble.pop();
                System.out.printf("%.1f ", valorASacar);
            }
        } catch (ExceptionPilaVacia e) {
            System.err.println();
            e.printStackTrace();
        }
    }

    public void pruebaPushInterger() {
        try {
            System.out.println("\nMetiendo elementos a pila Integer");
            for (int elemento: elementosInteger) {
                System.out.printf(" %d ", elemento);
                pilaInteger.push(elemento);
            }
        } catch (ExceptionPilaLlena e) {
            System.err.println();
            e.printStackTrace();
        }
    }

    public void pruebaPopInteger() {
        try {
            System.out.println("\n Sacando elementos de pila Integer");
            int valorASacar;

            while (true) {
                valorASacar = pilaInteger.pop();
                System.out.printf(" %d", valorASacar);
            }
        } catch (ExceptionPilaVacia e) {
            System.err.println();
            e.printStackTrace();
        }
    }


}
