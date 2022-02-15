package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio22 {
    public static void main(String[] args) {

        int[] a = {654, 34, 632, 5326 , 4, 75, 3742, 112, 87, 53};
        int[] b = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] c = new int[20];

        for (int i = 0; i < a.length; i++) {
            c[i*2] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            c[i*2+1] = b[i];
        }

        for (int n : c) {
            System.out.print(n + " ");
        }
    }
}
