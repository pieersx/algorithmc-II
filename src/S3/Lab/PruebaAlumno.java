package S3.Lab;

// Ejercicio 1
public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alu = new Alumno();
        alu.setCodigo(100);
        alu.setNombre("Eva");
        alu.setNota(15);

        alu.mostrarAlumno();
    }
}

// // Ejercicio 3
// public class PruebaTriangulo {
//     public static void main(String[] args) {
//         Punto p1 = new Punto(0, 0);
//         Punto p2 = new Punto(3, 0);
//         Punto p3 = new Punto(0, 4);


//         Triangulo triangulo = new Triangulo(p1, p2, p3);
//         System.out.println(triangulo);
//         if (triangulo.existe()) {
//             System.out.println("\nEl perímetro = " + triangulo.perimetro());
//             System.out.println("El área = " + triangulo.area());
//             System.out.println("El tipo = " + triangulo.tipo());
//         } else {
//             System.out.println("Los puntos no forman un triángulo");
//         }
//     }
// }


// Ejercicio 2
// public class PruebaPunto {
//     public static void main(String[] args) {
//         // Crea un punto en (1,1)
//         Punto p1 = new Punto(1, 1);
//         System.out.println("p1: " + p1);

//         // Crea dos puntos adicionales (1, 6) y (4, 5)
//         Punto p = new Punto(1, 6);
//         Punto q = new Punto(4, 5);
//         System.out.println("p: " + p);
//         System.out.println("q: " + q);

//         // Calcula y muestra las distancias entre p1 y los puntos p y q
//         System.out.println("\nDistancia entre p1 y p = " + p1.distancia(p) + " u2");
//         System.out.println("Distancia entre p1 y q = " + p1.distancia(q) + " u2");

//         // Determina cuál de los dos puntos (p o q) está más lejos de p1 y lo imprime
//         Punto r = p1.masLejano(p, q);
//         System.out.println("El punto más lejano de p1 = " + r);
//     }
// }

// Ejercicio 1
// public class PruebaAlumno {
//     public static void main(String[] args) {
//         Alumno alu = new Alumno();
//         alu.setCodigo(100);
//         alu.setNombre("Eva");
//         alu.setNota(15);

//         alu.mostrarAlumno();
//     }
// }
