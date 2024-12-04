package S3.Lab;

// // Ejercicio 3
// public class Triangulo {
//     private Punto p1;
//     private Punto p2;
//     private Punto p3;

//     private double lado1;
//     private double lado2;
//     private double lado3;

//     public Triangulo() {
//     }

//     public Triangulo(Punto p1, Punto p2, Punto p3) {
//         this.p1 = p1;
//         this.p2 = p2;
//         this.p3 = p3;
//         calcularLados();
//     }

//     public void calcularLados() {
//         this.lado1 = p1.distancia(p2);
//         this.lado2 = p2.distancia(p3);
//         this.lado3 = p3.distancia(p1);
//     }

//     public Punto getP1() {
//         return p1;
//     }

//     public void setP1(Punto p1) {
//         this.p1 = p1;
//     }

//     public Punto getP2() {
//         return p2;
//     }

//     public void setP2(Punto p2) {
//         this.p2 = p2;
//     }

//     public Punto getP3() {
//         return p3;
//     }

//     public void setP3(Punto p3) {
//         this.p3 = p3;
//     }

//     public boolean existe() {
//         return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
//     }

//     public double perimetro() {
//         return lado1 + lado2 + lado3;
//     }

//     public double area() {
//         double sp = perimetro()/2;

//         return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
//     }

//     public String tipo() {
//         if (lado1 == lado2 &&  lado1 == lado3 && lado2 == lado3) {
//             return "Equilatero";
//         } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
//             return "Isósceles";
//         } else {
//             return "Escaleno";
//         }
//     }

//     public String toString() {
//         return "Triángulo con vértices en " + p1 + ", " + p2 + ", " + p3;
//     }
// }


// // Ejercicio 2
// public class Punto {
//     // Atributos privados para almacenar las coordenadas X e Y del punto
//     private int x;
//     private int y;

//     // Constructor sin parámetros
//     public Punto() {
//     }

//     // Constructor que inicializa las coordenadas X e Y con valores específicos
//     public Punto(int valX, int valY) {
//         this.x = valX;
//         this.y = valY;
//     }

//     // Getter para obtener el valor de la coordenada X
//     public int getX() {
//         return x;
//     }

//     // Setter para modificar el valor de la coordenada X
//     public void setX(int valX) {
//         this.x = valX;
//     }

//     // Getter para obtener el valor de la coordenada Y
//     public int getY() {
//         return y;
//     }

//     // Setter para modificar el valor de la coordenada Y
//     public void setY(int valY) {
//         this.y = valY;
//     }

//     // Método que calcula la distancia entre el punto actual y otro punto dado
//     public double distancia(Punto p) {
//         int dx = p.x - this.x;
//         int dy = p.y - this.y;

//         return Math.sqrt(dx*dx + dy*dy);
//     }

//     // Método que retorna el punto más lejano entre dos puntos dados (p y q)
//     public Punto masLejano(Punto p, Punto q) {
//         if (this.distancia(p) >= this.distancia(q)) {
//             return p;
//         } else {
//             return q;
//         }
//     }

//     // Sobreescribe el método toString para representar el punto como una cadena de texto
//     public String toString() {
//         //return "(" + x + ", " + y + ")";
//         return "(" + this.x + ", " + this.y + ")";
//     }
// }

// Ejercicio 1
public class Alumno {
    private int codigo;
    private String nombre;
    private double nota;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarAlumno() {
        System.out.print("Alumno: ");
        System.out.print(codigo + " ");
        System.out.print(nombre + " ");
        System.out.println(nota);
    }
}
