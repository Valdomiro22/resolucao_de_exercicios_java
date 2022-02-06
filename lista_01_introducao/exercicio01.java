package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inteiro;

        System.out.print("Digite um numero inteiro: ");
        inteiro = teclado.nextInt();

        System.out.println("O número digitado foi: " + inteiro);

        teclado.close();
    }
}
