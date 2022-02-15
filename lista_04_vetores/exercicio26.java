package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio26 {
    public static void main(String[] args) {

        int[] v = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int somaValores=0;
        double media, desvio=0;

        for (int i = 0; i < 10; i++) {
            somaValores += v[i];
            media = (double) somaValores / i;

            desvio = Math.sqrt((double) i / (10) + Math.pow((v[i] - media), 2));
        }

        System.out.println(desvio);
    }
}
