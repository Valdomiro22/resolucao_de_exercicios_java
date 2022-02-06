package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double l, k;

        System.out.print("Digite a massa em libras: ");
        l = teclado.nextDouble();

        k = l * 0.45;

        System.out.println(l + " libras equivalem a " + k + " kg.");

        teclado.close();
    }
}
