package S2.PD1;

// Ejercicio 12 - Condicionales y bucles
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alumnosAprobados = 0;
        int alumnosAplazados = 0;
        int alumnosDesaprobados = 0;

        int n = 8;
        for (int i = 0; i < n; ++i) {
            System.out.print("Ingrese el promedio " + (i + 1) + ": ");
            int promedio = scanner.nextInt();

            if (promedio >= 11) {
                alumnosAprobados++;
            } else if (promedio >= 8 && promedio <= 10) {
                alumnosAplazados++;
            } else {
                alumnosDesaprobados++;
            }
        }

        System.out.println("\nAlumnos Aprobados    = " + alumnosAprobados);
        System.out.println("Alumnos Aplazados    = " + alumnosAplazados);
        System.out.println("Alumnos Desaprobados = " + alumnosDesaprobados);

        scanner.close();
    }
}

// Ejercicio 4 - Variables y Condicionales
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Ingrese un número [1-9999] = ");
//         int n = scanner.nextInt();

//         if (n > 0 && n < 10000) {
//             System.out.println("El número invertido = " + invertido(n));
//         } else {
//             System.out.println("El número " + n + " no esta en el rango [1-9999]");
//         }

//         scanner.close();
//     }

//     public static int invertido(int n) {
//         int numeroInvertido = 0;

//         while (n > 0) {
//             int digito = n % 10;
//             numeroInvertido = (numeroInvertido*10) + digito;
//             n /= 10;
//         }

//         return numeroInvertido;
//     }
// }

// Ejercicio 4 - Condicionales y bucles
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n;
//         int contador = 0;
//         do {
//             System.out.print("Ingrese números: ");
//             n = scanner.nextInt();

//             if (n >= 0) {
//                 contador++;
//             }

//         } while (n >= 0);

//         System.out.println("\nSe han introducido " + contador + " números");
//         scanner.close();
//     }
// }


// Ejercicio 7 - Condicionales y bucles
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int suma = 0;
//         int cien = 0;

//         int n = 5;
//         for (int i = 0; i < n; ++i) {
//             System.out.print("Ingrese el " + (i + 1) + " sueldo: ");
//             int sueldo = scanner.nextInt();

//             if (sueldo > 1000) {
//                 cien++;
//             }

//             suma += sueldo;
//         }

//         System.out.println("\nLa suma de los sueldos = " + suma);
//         System.out.println("Hay " + cien + " sueldos mayores que 1000");

//         scanner.close();
//     }
// }
