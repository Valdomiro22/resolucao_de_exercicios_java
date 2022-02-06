package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double g, r;
        final double PI = 3.1416;

        System.out.print("Informe o angulo em graus: ");
        g = teclado.nextDouble();

        r = g * PI / 180;

        System.out.println(g + " graus equivalem a " + r + " radianos.");

        teclado.close();
    }
}

