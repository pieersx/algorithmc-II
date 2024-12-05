package S13_Polimorfismo.Lab2;

public class Trapecio extends Cuadrilatero {
    private double baseMenor;
    private double baseMayor;
    private double lado1;
    private double lado2;
    private double altura;

    public Trapecio(double baseMenor, double baseMayor, double lado1, double lado2, double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro() {
        return getBaseMenor() + getBaseMayor() + getLado1() + getLado2();
    }

    public double area() {
        return getAltura() * (getBaseMayor() + getBaseMenor()) / 2;
    }
}
