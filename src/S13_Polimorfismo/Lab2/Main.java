package S13_Polimorfismo.Lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero rectangulo = new Rectangulo(10, 5);
        Cuadrilatero cuadrado = new Cuadrado(4);
        Cuadrilatero paralelogramo = new Paralelogramo(8, 6, 4);
        Cuadrilatero trapecio = new Trapecio(5, 10, 4, 4, 6);

        List<Cuadrilatero> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(cuadrado);
        figuras.add(paralelogramo);
        figuras.add(trapecio);

        for (Cuadrilatero figura : figuras) {
            System.out.println(figura.getClass().getSimpleName());
            System.out.println(figura.perimetro());
            System.out.println(figura.area());
            System.out.println();
        }
    }
}
