package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior=0, menor=0;

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " Posição: ");
            vetor[i] = teclado.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor || menor == 0) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        teclado.close();
    }
}
