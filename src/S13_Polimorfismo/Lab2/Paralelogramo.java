package S13_Polimorfismo.Lab2;

public class Paralelogramo extends Cuadrilatero {
    private double lado;
    private double base;
    private double altura;

    public Paralelogramo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro() {
        return 2 * (getBase() + getLado());
    }

    public double area() {
        return getBase() * getAltura();
    }
}
