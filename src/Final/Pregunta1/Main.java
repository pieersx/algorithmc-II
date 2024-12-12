package Final.Pregunta1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String archivoOriginal = "src\\Final\\Pregunta1\\entrada.txt";
        String archivoEncriptado = "src\\Final\\Pregunta1\\encriptado.txt";
        String archivoDesencriptado = "src\\Final\\Pregunta1\\desencriptado.txt";

        int constante = 4;

        System.out.println("Seleccione una opcion");
        System.out.println("1. Encriptar");
        System.out.println("2. Desencriptar");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: encriptarArchivo(archivoOriginal, archivoEncriptado, constante); break;
            case 2: desencriptarArchivo(archivoEncriptado, archivoDesencriptado, constante); break;
            default: System.out.println("Opcion no Valida"); break;
        }

    }

    public static void encriptarArchivo(String archivoEntrada, String archivoSalida, int constante) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));

            int caracter;
            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter + constante);
            }
            lector.close();
            escritor.close();

            System.out.println("Archivo encriptado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void desencriptarArchivo(String archivoEntrada, String archivoSalida, int constante) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida));

            int caracter;
            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter - constante);
            }

            lector.close();
            escritor.close();

            System.out.println("Archivo desencriptado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
