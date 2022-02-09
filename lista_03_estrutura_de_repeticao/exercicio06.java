package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n, soma = 0;
        float media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o inteiro " + (i + 1) + " : ");
            n = teclado.nextInt();

            soma += n;
        }

        media = soma / 10f;
        System.out.println("Média: " + media);

        teclado.close();
    }
}
