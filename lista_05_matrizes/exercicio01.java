package resolucaoDeExerciciosJava.lista_05_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int qt=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
                if (matriz[i][j] > 10) {
                    qt++;
                }
            }
        }

        for (int[] i : matriz) {
            System.out.print(Arrays.toString(i) + " ");
            System.out.println();
        }

        System.out.println("Quantidade de maiores que 10: " + qt);

        teclado.close();
    }
}
