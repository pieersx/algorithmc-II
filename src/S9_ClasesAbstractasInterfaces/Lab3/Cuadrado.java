package S9_ClasesAbstractasInterfaces.Lab3;

import java.util.Scanner;

public class Cuadrado extends Paralelogramo {
    protected double lado;

    public Cuadrado() {
        super();
        this.lado = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String toString() {
        return "[" + esquina.toString() + ", " + lado + "]";
    }

    public void desplaza(double deltaX, double deltaY) {
        esquina.desplaza(deltaX, deltaY);
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        this.lado = scanner.nextDouble();
    }
}
