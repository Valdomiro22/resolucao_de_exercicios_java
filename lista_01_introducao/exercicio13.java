package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double k, m;

        System.out.print("Informe o comprimento em kilometros: ");
        k = teclado.nextDouble();

        m = k / 1.61;

        System.out.println(k + " kilometros equivalem a " + m + " milhas.");

        teclado.close();
    }
}

