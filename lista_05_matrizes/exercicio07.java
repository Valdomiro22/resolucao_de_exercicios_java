package resolucaoDeExerciciosJava.lista_05_matrizes;

public class exercicio07 {
    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                } else if (i == j) {
                    matriz[i][j] = (3 * i * i) - 1;
                } else {
                    matriz[i][j] = (int) (4 * Math.pow(i, 3)) - (5 * j * j) + 1;
                }

                System.out.printf("[%d] ", matriz[i][j]);
            }
        }
    }
}
