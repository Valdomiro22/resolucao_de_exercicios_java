package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numeroReal, quadrado;

        System.out.print("Digite um número real: ");
        numeroReal = teclado.nextDouble();

        quadrado = numeroReal * numeroReal;

        System.out.println("O quadrado de " + numeroReal + " é: " + quadrado);

        teclado.close();
    }
}
