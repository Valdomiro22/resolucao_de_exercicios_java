package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, k;

        System.out.print("Digite a velocidade em Km/h: ");
        k = teclado.nextFloat();

        m = k / 3.6f;

        System.out.println(k + "Km/h equivalem a " + m + " metros por segundo.");

        teclado.close();
    }
}
