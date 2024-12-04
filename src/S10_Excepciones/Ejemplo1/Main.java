package S10_Excepciones.Ejemplo1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar hoy = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);

        IngresoEdad ingresoEdad = new IngresoEdad();
        int edad = ingresoEdad.getEdad("¿Qué edad tiene?");
        int yearActual = hoy.get(Calendar.YEAR);
        int yearNacimiento = yearActual - edad;

        System.out.print("¿ya cumplió años este año? (S/N): ");
        String respuesta = scanner.next();
        if (respuesta.equals("N") || respuesta.equals("n")) yearNacimiento--;

        System.out.println("\nUsted nació en " + yearNacimiento);

        scanner.close();
    }
}
