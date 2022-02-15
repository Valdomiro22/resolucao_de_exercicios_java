package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio32 {
    public static void main(String[] args) {

        int[] x = {654, 34, 632, 112, 87};
        int[] y = {94, 34, 62, 11, 87};
        int[] soma = new int[5];
        int[] produto = new int[5];
//        int[] diferenca = new int[10];
        int[] uniao = new int[10];
        int[] intersecsao = new int[10];

        int flag;

        System.out.print("X: ");
        for (int i : x) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Y: ");
        for (int i : y) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Soma: ");
        for (int i = 0; i < x.length; i++) {
            soma[i] = x[i] + y[i];
            System.out.print(soma[i] + " ");
        }

        System.out.println();
        System.out.print("Produto: ");
        for (int i = 0; i < x.length; i++) {
            produto[i] = x[i] * y[i];
            System.out.print(produto[i] + " ");
        }

        System.out.println();
        System.out.print("Diferença: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    x[i] = 0;
                }
            }
        }

        for (int i : x) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("União: ");
        for (int j = 0; j < 5; j++) {
            uniao[j] = x[j];
            uniao[j + 5] = y[j];
        }

        for (int i : uniao) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Intersecssão: ");

        for (int i = 0; i < 5; i++) {
            intersecsao[i] = x[i];
            intersecsao[i + 5] = y[i];
        }

        for (int i : intersecsao) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
