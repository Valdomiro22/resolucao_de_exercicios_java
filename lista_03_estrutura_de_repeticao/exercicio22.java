package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int quantidade = 0;
        double nota, soma = 0, media;

        System.out.print("Informe a nota (entre 10 e 20) ou -1 para finalizar: ");
        nota = teclado.nextDouble();
        while (nota < 10 || nota > 20) {
            System.out.print("Nota inválida! Corrija: ");
            nota = teclado.nextDouble();
        }

        while (nota != -1) {
            soma += nota;
            quantidade++;

            System.out.print("Informe a nota (entre 10 e 20) ou -1 para finalizar: ");
            nota = teclado.nextDouble();
        }

        media = soma / quantidade;

        System.out.println("Média = " + media);

        teclado.close();

    }
}
