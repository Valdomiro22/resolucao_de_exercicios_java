package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        int[] vetor = {654, 34, 632, 3742, 112, 87};

        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
