package S3.Lab;

// Ejercicio 2

public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int valX, int valY) {
        this.x = valX;
        this.y = valY;
    }

    public int getX() {
        return x;
    }

    public void setX(int valX) {
        this.x = valX;
    }

    public int getY() {
        return y;
    }

    public void setY(int valY) {
        this.y = valY;
    }

    public double distancia(Punto p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;

        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
