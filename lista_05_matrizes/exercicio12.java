package resolucaoDeExerciciosJava.lista_05_matrizes;

public class exercicio12 {
    public static void main(String[] args) {

        int[][] matriz = {{5, 5, 5}, {2, 2, 2}, {8, 8, 8}};
        int[][] transposta = new int[3][3];

        System.out.print("Normal");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d] ", matriz[i][j]);
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Transposta");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d] ", transposta[i][j]);
            }
        }

    }
}
