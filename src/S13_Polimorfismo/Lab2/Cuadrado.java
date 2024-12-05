package S13_Polimorfismo.Lab2;

public class Cuadrado extends Cuadrilatero {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return 4 * getLado();
    }

    public double area() {
        return Math.pow(lado, 2);
    }
}
