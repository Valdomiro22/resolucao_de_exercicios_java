package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double m, k;

        System.out.print("Digite a massa em milhas: ");
        m = teclado.nextDouble();

        k = m * 1.61;

        System.out.println(m + " milhas equivalem a " + k + " kg.");

        teclado.close();
    }
}

