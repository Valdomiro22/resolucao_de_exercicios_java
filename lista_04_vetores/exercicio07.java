package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vetor = {654, 34, 632, 5326 , 4, 75, 3742, 112, 87, 53};
        int maior = 0;
        Integer posicao = null;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.println("Maior: " + maior);
        System.out.println("Posição: " + posicao);

        teclado.close();
    }
}
