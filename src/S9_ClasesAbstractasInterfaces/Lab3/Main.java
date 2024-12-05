package S9_ClasesAbstractasInterfaces.Lab3;

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.leer();
        System.out.println("Comprobamos que sea cerrada: " + c1.esCerrada());
        System.out.println("La esquina y el lado del cuadrado es: " + c1.toString());
        System.out.println("Luego de desplazar la esquina en 5 a ambas coordenas obtenemos");

        c1.desplaza(5, 5);
        System.out.println("La esquina y el lado del cuadrado es: " + c1.toString());
        System.out.println("Luego de desplazar la esquina en 2 a ambas coordenas y cambiar el lado a 5 obtenemos");

        c1.desplaza(2, 2);
        c1.setLado(5);
        System.out.println("La esquina y el lado del cuadrado es: " + c1.toString());

        System.out.println("Luego de sumarle al lado su misma cantidad");
        c1.setLado(c1.getLado() + c1.getLado());
        System.out.println("La esquina y el lado del cuadrado es: " +c1.toString());
    }
}
