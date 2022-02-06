package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final float PREMIO = 780_000_00;
        float ganhador1, ganhador2, ganhador3;

        ganhador1 = PREMIO * 0.46f;
        ganhador2 = PREMIO * 0.32f;
        ganhador3 = PREMIO * (1 - (0.46f + 0.32f));

        System.out.print("Ganhador 1 irá receber: " + ganhador1);
        System.out.print("\nGanhador 2 irá receber: " + ganhador2);
        System.out.print("\nGanhador 3 irá receber: " + ganhador3);

        teclado.close();
    }
}
