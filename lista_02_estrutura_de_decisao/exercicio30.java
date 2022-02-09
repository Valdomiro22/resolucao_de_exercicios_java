package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Primeiro numero: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo numero: ");
        n2 = teclado.nextInt();
        System.out.print("Terceiro numero: ");
        n3 = teclado.nextInt();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.printf("%d %d %d", n1, n2, n3);
        } else if (n1 > n3 && n3 > n2) {
            System.out.printf("%d %d %d", n1, n3, n2);
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.printf("%d %d %d", n2, n1, n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.printf("%d %d %d", n2, n3, n1);
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.printf("%d %d %d", n3, n1, n2);
        } else if (n3 > n2 && n2 > n1) {
            System.out.printf("%d %d %d", n3, n2, n1);
        }

        teclado.close();
    }
}
