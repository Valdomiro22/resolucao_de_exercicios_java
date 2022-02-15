package resolucaoDeExerciciosJava.lista_05_matrizes;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j ++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for(int i=0; i<5; i++){
            System.out.printf("\n");
            for(int j=0; j<5; j++){
                System.out.printf("[%d]", matriz[i][j]);
            }
        }

        teclado.close();
    }
}
