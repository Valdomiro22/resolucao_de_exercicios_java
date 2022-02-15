package resolucaoDeExerciciosJava.lista_05_matrizes;

public class exercicio06 {
    public static void main(String[] args) {

        int[][] matriz1 = {{9, 95, 47, 5}, {995, 95, 958, 59}, {25, 62, 47, 5}, {48, 88, 957, 65}};
        int[][] matriz2 = {{98, 77, 775, 57}, {85, 95, 958, 598}, {25, 7756, 47, 57}, {48, 887, 957, 65}};
        int[][] matriz3 = new int[1][2];
        int maior=0, menor=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz1[i][j] > maior) {
                    maior = matriz1[i][j];
                    matriz3[0][0] = matriz1[i][j];
                }

                if (matriz2[i][j] < menor || menor == 0) {
                    menor = matriz2[i][j];
                    matriz3[0][1] = matriz2[i][j];
                }
            }
        }

        System.out.println(matriz3[0][0] + " " + matriz3[0][1]);
    }
}
