package resolucaoDeExerciciosJava.lista_05_matrizes;

public class exercicio13 {
    public static void main(String[] args) {

        int[][] matriz = {{19, 5, 17, 6}, {9, 15, 18, 12}, {14, 16, 11,10}, {17, 13, 2, 11}};

        System.out.println("Antes");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d] ", matriz[i][j]);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println();
        System.out.println("Depois");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d] ", matriz[i][j]);
            }
        }


    }
}
