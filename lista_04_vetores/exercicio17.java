package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio17 {
    public static void main(String[] args) {

        int[] vetor = {96, -34, 632, -5326 , 4, -75, 3742, -112, 87, -53};

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        for (int numero : vetor) {
            System.out.println(numero);
        }
    }
}
