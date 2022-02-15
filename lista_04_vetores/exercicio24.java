package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio24 {
    public static void main(String[] args) {

        int[] numeros = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        double[] alturas = {1.48, 1.36, 1.78, 1.98, 1.68, 1.95, 1.86, 1.85, 2.10, 1.49};

        double maisAlto=0.0, maisBaixo=0.0;
        int numeroMaisBaixo=0, numeroMaisAlto=0;

        for (int i = 0; i < numeros.length; i++) {
            if (alturas[i] > maisAlto) {
                maisAlto = alturas[i];
                numeroMaisAlto = numeros[i];
            }

            if (alturas[i] < maisBaixo || maisBaixo == 0.0) {
                maisBaixo = alturas[i];
                numeroMaisBaixo = numeros[i];
            }
        }

        System.out.println("Mais alto: " + maisAlto + "  numero: " + numeroMaisAlto);
        System.out.println("Mais baixo: " + maisBaixo + "  numero: " + numeroMaisBaixo);
    }
}
