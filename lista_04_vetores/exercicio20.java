package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio20 {
    public static void main(String[] args) {

        int[] vet = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] v2 = new int[10];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 != 0) {
                v2[i] = vet[i];
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println();
            System.out.print(vet[i] + " ");
            System.out.print(v2[i] + " ");
        }
    }
}
