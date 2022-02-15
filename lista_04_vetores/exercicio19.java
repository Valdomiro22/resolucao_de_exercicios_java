package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio19 {
    public static void main(String[] args) {

        double[] vet = new double[50];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = (i + 5 * i) % (i + 1);
        }

        for (double v : vet) {
            System.out.println(v);
        }
    }
}
