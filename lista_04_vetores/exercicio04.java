package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] posicoes = new int[8];
        int i, x, y;

        for (i=0; i<8; i++) {
            System.out.printf("Posição [%d]: ", (i));
            posicoes[i] = teclado.nextInt();
        }

        System.out.println("x: ");
        x = teclado.nextInt();
        System.out.println("y: ");
        y = teclado.nextInt();

        int soma = posicoes[x] + posicoes[y];

        System.out.println(soma);

        teclado.close();
    }
}
