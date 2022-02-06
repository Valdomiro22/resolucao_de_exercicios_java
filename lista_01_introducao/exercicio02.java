package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numeroReal;

        System.out.print("Digite um numero real: ");
        numeroReal = teclado.nextDouble();

        System.out.println("Numero digitado: " + numeroReal);

        teclado.close();
    }
}
