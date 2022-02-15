package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio14 {
    public static void main(String[] args) {

        double[] vetor = {-64, 34.6, 12, -96.1, 4, 75.6, -32, 12, 4, 53.1};

        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }
}
