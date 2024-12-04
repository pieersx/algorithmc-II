package S10_Excepciones.Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Calculadora");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción --> ");

                int opc = scanner.nextInt();

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opc) {
                    case 1: {
                        resultado = num1 + num2;
                        System.out.println(resultado);
                        break;
                    }
                    case 2: {
                        resultado = num1 - num2;
                        System.out.println(resultado);
                        break;
                    }
                    case 3: {
                        resultado = num1 * num2;
                        System.out.println(resultado);
                        break;
                    }
                    case 4: {
                        if (num2 == 0) {
                            throw new ArithmeticException("No se puede dividir entre cero");
                        }

                        resultado = num1 / num2;
                        System.out.println(resultado);
                        break;
                    }
                    case 5: {
                        System.out.println("Saliendo...");
                        scanner.close();
                        return;
                    }
                    default: {
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Entrada inválida. Por favor ingrese sólo dígitos");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
