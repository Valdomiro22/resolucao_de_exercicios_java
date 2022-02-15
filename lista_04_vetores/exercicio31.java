package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio31 {
    public static void main(String[] args) {

        int[] v1 = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] v2 = {15, 6, 45, 9, 7, 22, 42, 35, 49, 114};
        int[] uniao = new int[20];
        int quantidade=0;

        System.out.print("V1: ");
        for (int i : v1) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("V2: ");
        for (int i : v2) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < v1.length; i++) {
            for (int j = i; j < v1.length; j++) {
                uniao[i] = v1[i];
                uniao[i + 10] = v2[i];
            }
        }

        for (int i : uniao) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sem repetição: ");
        for (int i = 0; i < uniao.length; i++) {
            for (int j = i + 1; j < uniao.length; j++) {
                if (uniao[i] == uniao[j]) {
                    uniao[i] = 0;
                    break;
                }
            }


            if (uniao[i] != 0) {
                System.out.print(uniao[i] + " ");
                quantidade++;
            }
        }
    }
}
