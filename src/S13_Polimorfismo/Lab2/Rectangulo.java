package S13_Polimorfismo.Lab2;

public class Rectangulo extends Cuadrilatero {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
        return 2 * (getBase() + getAltura());
    }

    public double area() {
        return getBase() * getAltura();
    }
}
