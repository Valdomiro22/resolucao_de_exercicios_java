package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio52 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double apostador1, apostador2, apostador3, somaApostas;
        double porcentagem1, porcentagem2, porcentagem3;
        double premio1, premio2, premio3, premio;

        System.out.print("Valor da aposta do apostador 1: ");
        apostador1 = teclado.nextDouble();
        System.out.print("Valor da aposta do apostador 2: ");
        apostador2 = teclado.nextDouble();
        System.out.print("Valor da aposta do apostador 3: ");
        apostador3 = teclado.nextDouble();
        System.out.print("Valor do premio: ");
        premio = teclado.nextDouble();

        somaApostas = apostador1 + apostador2 + apostador3;
        porcentagem1 = apostador1 / somaApostas;
        porcentagem2 = apostador2 / somaApostas;
        porcentagem3 = apostador3 / somaApostas;

        premio1 = premio * porcentagem1;
        premio2 = premio * porcentagem2;
        premio3 = premio * porcentagem3;

        System.out.printf("%.2f", premio1);
        System.out.printf("\n%.2f", premio2);
        System.out.printf("\n%.2f", premio3);

        teclado.close();
    }
}
