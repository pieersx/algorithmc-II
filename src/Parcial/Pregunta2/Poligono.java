package Parcial.Pregunta2;

public class Poligono {
    private Punto[] puntos;

    public Poligono(Punto[] puntos) {
        this.puntos = puntos;
    }

    public double perimetro() {
        double perimetro = 0;
        for (int i = 0; i < puntos.length - 1; ++i) {
            perimetro += Punto.distancia(puntos[i], puntos[i + 1]);
        }
        perimetro += Punto.distancia(puntos[0], puntos[puntos.length - 1]);
        return perimetro;
    }
}
