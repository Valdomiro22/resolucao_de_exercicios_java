package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, a;

        System.out.print("Informe a área em metros quadrados: ");
        m = teclado.nextFloat();

        a = m * 0.000247f;

        System.out.println(m + " metros quadrados equivalem a " + a + " acres.");

        teclado.close();
    }
}
