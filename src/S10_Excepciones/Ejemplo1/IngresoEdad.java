package S10_Excepciones.Ejemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IngresoEdad {
    // c. Código con lanzamiento de excepciones y bloques catch múltiples
    private static final String MENSAJE = "Edad: ";
    private Scanner scanner;

    public IngresoEdad() {
        scanner = new Scanner(System.in);
    }

    public int getEdad() {
        return getEdad(MENSAJE);
    }

    public int getEdad(String prompt) {
        int edad;
        while (true) {
            System.out.println(prompt);
            try {
                edad = scanner.nextInt();
                if (edad < 0) {
                    throw new Exception("Edad negativa es inválida");
                }
                return edad;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Entrada inválida. Por favor ingrese sólo dígitos");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // b. Código con manejo de excepciones
    // private static final String MENSAJE = "Edad: ";
    // private Scanner scanner;

    // public IngresoEdad() {
    //     scanner = new Scanner(System.in);
    // }

    // public int getEdad() {
    //     return getEdad(MENSAJE);
    // }

    // public int getEdad(String prompt) {
    //     int edad;
    //     while (true) {
    //         System.out.println(prompt);
    //         try {
    //             edad = scanner.nextInt();
    //             return edad;
    //         } catch (Exception e) {
    //             scanner.next();
    //             System.out.println("Entrada inválida. Por favor ingrese sólo dígitos");
    //         }
    //     }
    // }

    // a. Código sin manejo de excepciones
    // private static final String MENSAJE = "Edad: ";
    // private Scanner scanner;

    // public IngresoEdad() {
    //     scanner = new Scanner(System.in);
    // }

    // public int getEdad() {
    //     return getEdad(MENSAJE);
    // }

    // public int getEdad(String prompt) {
    //     System.out.println(prompt);
    //     int edad = scanner.nextInt();
    //     return edad;
    // }
}
