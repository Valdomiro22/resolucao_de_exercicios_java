package resolucaoDeExerciciosJava.lista_05_matrizes;

public class exercicio11 {
    public static void main(String[] args) {

        int[][] matriz = {{9, 95, 47}, {99, 95, 59}, {48, 88, 957}};
        int soma=0;

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    soma += matriz[i][j];
                }

                System.out.printf("[%d] ", matriz[i][j]);
            }
        }

        System.out.println();
        System.out.print("Soma: " + soma);
    }
}
