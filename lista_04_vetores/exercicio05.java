package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[10];
        int qtPar=0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor da posição: " + i);
            vetor[i] = teclado.nextInt();

            if (vetor[i] % 2 == 0) {
                qtPar++;
            }
        }

        System.out.println("Quantidade de valores pares: " + qtPar);

        teclado.close();
    }
}
