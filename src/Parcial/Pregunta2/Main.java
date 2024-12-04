package Parcial.Pregunta2;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(4, 3);
        Punto p4 = new Punto(0, 3);

        Segmento segmento = new Segmento(p1, p2);
        System.out.println("Longitud del segmento: " + segmento.longitud());

        Punto[] vertices = {p1, p2, p3, p4};

        Poligono cuadrilatero = new Poligono(vertices);
        System.out.println("Perímetro del cuadrilátero: " + cuadrilatero.perimetro());
    }
}
