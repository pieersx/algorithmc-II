package Parcial.Pregunta1;

public class Triangulo {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double calcularPerimetro() {
        return a + b + c;
    }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calcularArea(double b, double h) {
        return (b * h) / 2;
    }
}
