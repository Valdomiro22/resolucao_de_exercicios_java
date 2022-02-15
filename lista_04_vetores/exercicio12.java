package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Arrays;

public class exercicio12 {
    public static void main(String[] args) {

        double[] valores = {-64, 34.6, -56.1, 4, 75.6, -32, 12, 87.6, 53.1};
        double maior=0, menor=0, soma=0, media;

        for (double valor : valores) {
            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor || menor == 0) {
                menor = valor;
            }

            soma += valor;
        }

        media = soma / valores.length;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
        System.out.println("Media: " + Arrays.stream(valores).sum() / valores.length);
    }
}
