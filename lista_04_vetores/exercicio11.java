package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio11 {
    public static void main(String[] args) {

        double[] numeros = {64, 34.6, -32.1, 56.1, 4, -75.6, 32, 12, -87.6, 53.1};

        int qtNegativos = 0;
        float somaPositivos = 0;

        for (double numero : numeros) {
            if (numero < 0) {
                qtNegativos++;
            } else {
                somaPositivos += numero;
            }
        }

        System.out.println("Soma dos positivos: " + somaPositivos);
        System.out.println("Quantidade de negativos: " + qtNegativos);

    }
}
