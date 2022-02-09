package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        teclado.close();
    }
}
