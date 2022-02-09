package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;

        System.out.print("Pirmeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo número: ");
        n2 = teclado.nextInt();


        if (n1 > n2) {
            System.out.println("O primeiro é maior");
        } else if (n2 > n1) {
            System.out.println("O segundo é maior");
        } else {
            System.out.println("Números iguais");
        }

        teclado.close();
    }
}
