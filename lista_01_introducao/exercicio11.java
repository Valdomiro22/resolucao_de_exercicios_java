package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, k;

        System.out.print("Digite a velocidade em m/s: ");
        m = teclado.nextFloat();

        k = m * 3.6f;

        System.out.println(m + " m/s equivalem a " + k + " k/h.");

        teclado.close();
    }
}