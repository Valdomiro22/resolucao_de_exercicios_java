package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio10 {
    public static void main(String[] args) {

        double[] notas = {64, 34.6, 32.1, 56.1 , 4, 75.6, 32, 12, 87.6, 53.1, 56.1 , 4, 75.6, 32, 12};
        double media, soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println("Média: " + media);
    }
}
