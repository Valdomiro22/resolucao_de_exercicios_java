package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        System.out.print("Iforme a primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Iforme a segunda nota: ");
        n2 = teclado.nextFloat();
        System.out.print("Iforme a terceira nota: ");
        n3 = teclado.nextFloat();
        System.out.print("Iforme a quarta nota: ");
        n4 = teclado.nextFloat();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média das notas é: " + media);

        teclado.close();
    }
}
