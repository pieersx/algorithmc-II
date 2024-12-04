package S10_Excepciones.Lab2;

public class Triangulo {
    private int a;
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) throws Exception {
        if (!esTrianguloValido(a, b, c)) {
            throw new Exception("Los valores ingresados no formarán un triángulo válido.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean esTrianguloValido(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public double calcularArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
