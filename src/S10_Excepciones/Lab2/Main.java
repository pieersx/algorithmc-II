package S10_Excepciones.Lab2;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear un triángulo válido
            Triangulo triangulo = new Triangulo(3, 4, 5);
            System.out.println("El área del triángulo es: " + triangulo.calcularArea());

            Triangulo trianguloInvalido = new Triangulo(1, 2, 10);
            System.out.println("El área del triángulo inválido es: " + trianguloInvalido.calcularArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
