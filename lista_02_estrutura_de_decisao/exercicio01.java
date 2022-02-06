package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;

        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior");
        } else if (n2 > n1) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }

        teclado.close();
    }
}
