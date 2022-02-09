package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, soma = 0, produto = 1;

        System.out.print("Valor inicial: ");
        inicio = teclado.nextInt();
        System.out.print("Valor de fim: ");
        fim = teclado.nextInt();

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            } else {
                produto *= i;
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + produto);

        teclado.close();
    }
}
