package S11_ClasesGenericas.Lab1;

public class Main {
    public static void main(String[] args) {
        Integer[] arregloIntegers = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arregloCharacter = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Arreglo arregloInteger: ");
        imprimirArreglo(arregloIntegers);
        System.out.println();

        System.out.println("Arreglo arregloDouble: ");
        imprimirArreglo(arregloDouble);
        System.out.println();

        System.out.println("Arreglo arregloCharacter: ");
        imprimirArreglo(arregloCharacter);
    }

    public static<E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
}
