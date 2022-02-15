package resolucaoDeExerciciosJava.lista_05_matrizes;

import java.util.Scanner;

public class exercicio04 {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            int[][] matriz = {{89, 95, 47, 5}, {95, 95, 958, 59}, {25, 62, 47, 5}, {48, 88, 957, 65}};
            int maior=0, menor=0;
            int linhaMaior=0, linhaMenor=0;
            int colunaMaior=0, colunaMenor=0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
//                    System.out.printf("[%d][%d] ", i, j);
//                    matriz[i][j] = teclado.nextInt();

                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                        linhaMaior = i;
                        colunaMaior = j;
                    }

                    if (matriz[i][j] < menor || menor == 0) {
                        menor = matriz[i][j];
                        linhaMenor = i;
                        colunaMenor = j;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                System.out.println();
                for (int j = 0; j < 4; j++) {
                    System.out.printf("[%d] ", matriz[i][j]);
                }
            }

            System.out.println();
            System.out.printf("Maior: [%d][%d]", linhaMaior, colunaMaior);
            System.out.printf("\nMenor: [%d][%d]", linhaMenor, colunaMenor);

            teclado.close();
        }
}
