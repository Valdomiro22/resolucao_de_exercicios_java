package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio15 {
    public static void main(String[] args) {

        int [] vetor = {654, 34, 4, 5326 , 4, 75, 3742, 112, 87, 53, 65, 112, 257, 457, 5326, 75, 957, 145, 365, 259};

        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }
}
