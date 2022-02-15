package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio30 {
    public static void main(String[] args) {

        int[] v1 = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] v2 = {15, 6, 45, 9, 7, 22, 42, 35, 49, 114};
        int[] intersecsao = new int[10];

        System.out.print("V1: ");
        for (int i : v1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("V2: ");
        for (int i : v2) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1.length; j++) {
                if (v1[j] == v2[i]) {
                    intersecsao[i] = v1[i];
                }
            }
        }

        System.out.println();
        System.out.print("Intersecsão: ");
        for (int n : intersecsao) {
            if (n != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
