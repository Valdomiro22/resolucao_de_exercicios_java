package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vet = new int[6];

        for (int i=0; i<6; i++) {
            System.out.printf("Valor da posição [%d]: ", i+1);
            vet[i] = teclado.nextInt();
        }

        for (int i=0; i<6; i++) {
            System.out.println(vet[i]);
        }

        teclado.close();
    }
}
