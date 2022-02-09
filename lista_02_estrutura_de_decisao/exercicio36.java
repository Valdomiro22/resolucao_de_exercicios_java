package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float valorVenda, comicao;

        System.out.print("Valor da venda: ");
        valorVenda = teclado.nextFloat();

        if (valorVenda < 20_000) {
            comicao = 400 + (valorVenda * 0.14f);
            System.out.println("Comição = " + comicao);
        } else if (valorVenda < 40_000) {
            comicao = 500 + (valorVenda * 0.14f);
            System.out.println("Comição = " + comicao);
        } else if (valorVenda < 60_000) {
            comicao = 550 + (valorVenda * 0.14f);
            System.out.println("Comição = " + comicao);
        } else if (valorVenda < 80_000) {
            comicao = 600 + (valorVenda * 0.14f);
            System.out.println("Comição = " + comicao);
        } else if (valorVenda < 100_000) {
            comicao = 650 + (valorVenda * 0.14f);
            System.out.println("Comição = " + comicao);
        } else if (valorVenda > 100_000) {
            comicao = 700 + (valorVenda * 0.16f);
            System.out.println("Comição = " + comicao);
        }

        teclado.close();
    }
}
