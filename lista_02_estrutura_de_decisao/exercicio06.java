package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, diferenca;

        System.out.print("Pirmeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo número: ");
        n2 = teclado.nextInt();

        diferenca = Math.abs(n1 - n2);

        if (n1 > n2) {
            System.out.println("O primeiro é maior");
        } else {
            System.out.println("O segundo é maior");
        }

        System.out.println("A diferença entre eles é: " + diferenca);

        teclado.close();
    }
}
