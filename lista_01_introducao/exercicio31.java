package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero inteiro: ");
        numero = teclado.nextInt();

        System.out.println("Antecessor: " + (numero - 1) + "\nsucessor: " + (numero + 1));

        teclado.close();
    }
}
