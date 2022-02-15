package resolucaoDeExerciciosJava.lista_05_matrizes;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = {{9, 95, 47, 5, 553}, {995, 95, 958, 59, 234}, {25, 62, 47, 5, 235},
                            {48, 88, 957, 65, 343}, {4878, 88, 9657, 645, 87}};

        Integer linha=null, coluna=null;
        int valor;

        System.out.print("Valor: ");
        valor = teclado.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valor) {
                    System.out.printf("[%d][%d]", i, j);
                }
            }
        }

        teclado.close();
    }
}
