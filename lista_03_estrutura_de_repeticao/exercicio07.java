package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0, quantidade = 0;
        double media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                soma += numero;
                quantidade++;
            }
        }

        media = (double) soma / quantidade;
        System.out.println("Quantidade de números validos: " + quantidade);
        System.out.printf("Média: %.2f", media);

        teclado.close();
    }
}
