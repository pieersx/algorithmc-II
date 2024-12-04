package Parcial.Pregunta2;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double distancia(Punto p1, Punto p2) {
        double dx = Math.pow(p1.getX() - p2.getX(), 2);
        double dy = Math.pow(p1.getY() - p2.getY(), 2);
        return Math.sqrt(dx + dy);
    }
}
