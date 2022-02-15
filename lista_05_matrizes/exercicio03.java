package resolucaoDeExerciciosJava.lista_05_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
                System.out.println();
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
                System.out.printf("[%d] ", matriz[i][j]);
            }
        }

        teclado.close();
    }
}
