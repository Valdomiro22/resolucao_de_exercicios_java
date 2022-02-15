package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio13 {
    public static void main(String[] args) {

        double[] valores = {-64, 34.6, 32.1, -96.1, 4, 75.6, -32, 12, 87.6, 53.1};
        double maior=0.0, menor=0.0;
        int posicaoMaior=0, posicaoMenor=0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
            if (valores[i] > maior) {
                maior = valores[i];
                posicaoMaior = i;
            }

            if (valores[i] < menor || menor == 0.0) {
                menor = valores[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nMaior: " + maior + " Posição: " + posicaoMaior);
        System.out.println("Menor: " + menor + " Posição: " + posicaoMenor);
    }
}
