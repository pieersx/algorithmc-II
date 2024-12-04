package Parcial.Pregunta1;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 4, 5);
        System.out.println(t1.calcularPerimetro());
        System.out.println(t1.calcularArea());

        Triangulo t2 = new Triangulo(5, 12);
        System.out.println(t2.calcularArea(t2.getB(), t2.getH()));
    }
}
