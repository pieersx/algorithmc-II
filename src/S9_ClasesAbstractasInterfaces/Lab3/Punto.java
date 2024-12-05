package S9_ClasesAbstractasInterfaces.Lab3;

import java.util.Scanner;

public class Punto extends Figura {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desplaza(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de x: ");
        this.x = scanner.nextDouble();
        System.out.println("Ingrese el valor de y: ");
        this.y = scanner.nextDouble();
    }

    public boolean esCerrada() {
        return false;
    }

}
