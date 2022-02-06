package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float h, m;

        System.out.print("Informe a área em hectares: ");
        h = teclado.nextFloat();

        m = h * 10000;

        System.out.println(h + " hectares equivalem a " + m + " metros quadrados.");

        teclado.close();
    }
}
