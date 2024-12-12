package S14_PersistenciaArchivos.Lab6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src\\S14_PersistenciaArchivos\\Lab6\\Main2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            salida.println("\t\t\tSUPREMACIA DE ROMA\n");
            salida.println("En el reinado de Roma de Tulio Hostilio, los ");
            salida.println("tres hermanos Curiacios, campeones de la villa del Alba ");
            salida.println("y los tres hermanos Horacios, campeones de la villa Roma");
            salida.println(" tenían que definir la supremacía de sus pueblos.");
            salida.println("En el primer encuentro los tres hermanos Curiacios ");
            salida.println("fueron heridos y dos Horacios murieron.");
            salida.println("Tres contra uno ...!");
            salida.println("El superviviente Horacio fingiendo huir desplazó a los ");
            salida.println("tres hermanos Curiacios pudiendo así derrotar a cada ");
            salida.println("uno y de esta forma dió el triunfo a su patria.");
            salida.println("Al regresar a Roma fue recibido con imprecaciones de su ");
            salida.println("hermana Camila, prometida de uno de los Curiacios, y ");
            salida.println("que su hermano atravesó con su espada. ");
            salida.println("Horacio fue absuelto de este crimen en recompensa a los ");
            salida.println("sevicios prestados a la patria ");
            salida.close();

            FileReader fr = new FileReader("src\\S14_PersistenciaArchivos\\Lab6\\Main2.txt");
            BufferedReader br = new BufferedReader(fr);
            String texto = new String();
            String cadena = br.readLine();

            while (cadena != null) {
                texto = texto + cadena + "\n";
                cadena = br.readLine();
            }
            System.out.println("Texto Leido: " + "\n" + texto);
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
