package S2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Ingrese el valor Decimal = ");
        int nDecimal = scanf.nextInt();

        int nBinario = 0;
        int i = 0;
        while (nDecimal > 0) {
            int digito = nDecimal % 2;
            nBinario += digito * Math.pow(10, i);
            nDecimal /= 2;
            i++;
        }
        System.out.println("Valor Binario = " + nBinario);


        System.out.print("\nIngrese el valor Binario = ");
        nBinario = scanf.nextInt();

        nDecimal = 0;
        i = 0;
        while (nBinario > 0) {
            int digito = nBinario % 10;
            nDecimal += digito * Math.pow(2, i);
            nBinario /= 10;
            i++;
        }
        System.out.println("Valor Decimal = " + nDecimal);

        scanf.close();
    }
}
