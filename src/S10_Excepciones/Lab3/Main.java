package S10_Excepciones.Lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fecha = scanner.nextLine();

        try {
            StringTokenizer tokenizer = new StringTokenizer(fecha, "/");
            if (tokenizer.countTokens() != 3) {
                throw new IllegalArgumentException("Error: formato incorrecto. Usar dd/mm/yyyy");
            }

            int dia = Integer.parseInt(tokenizer.nextToken());
            int mes = Integer.parseInt(tokenizer.nextToken());
            int year = Integer.parseInt(tokenizer.nextToken());

            if (dia < 1 || dia > 31) throw new IllegalArgumentException("Error: Día inválido. Debe estar entre 1 y 31.");
            if (mes < 1 || mes > 12) throw new IllegalArgumentException("Error: Mes inválido. Debe estar entre 1 y 12.");
            if (year < 0) throw new IllegalArgumentException("Error: Año inválido. Debe ser > 0");

            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (dia > diasPorMes[mes - 1]) throw new IllegalArgumentException("Error: Día inválido para el mes especificado.");

            System.out.println("La fecha ingresada es valida " + fecha);
        } catch (NumberFormatException e) {
            System.out.println("Error: Los elementos deben ser numeros");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
