package S14_PersistenciaArchivos.Lab5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\S14_PersistenciaArchivos\\Lab5\\Main.java"));

        String cadena = in.readLine();
        while (cadena != null) {
            System.out.println(cadena);
            cadena = in.readLine();
        }
        in.close();
    }
}
