package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio23 {
    public static void main(String[] args) {

        double[] v1 = {64.48, 34.6, 32.1, 56.1, 4.53};
        double[] v2 = {6.69, 349.6, 3.981, 33.1, 47.53};
        double produtoEscalar = 0;

        for (int i = 0; i < v1.length; i++) {
            produtoEscalar += v1[i] * v2[i];
        }

        System.out.println(produtoEscalar);
    }
}
