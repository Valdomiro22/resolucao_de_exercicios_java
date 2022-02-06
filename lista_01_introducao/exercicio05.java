package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numeroReal, quintaParte;

        System.out.print("Digite um número real: ");
        numeroReal = teclado.nextDouble();

        quintaParte = numeroReal / 5;

        System.out.println("A quinta parte de " + numeroReal + " é: " + quintaParte);

        teclado.close();
    }
}
