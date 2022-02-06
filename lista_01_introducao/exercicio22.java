package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double j, m;

        System.out.print("Informe o comprimento em Jardas: ");
        j = teclado.nextDouble();

        m = 0.91 * j;

        System.out.println(j + " jardas equivalem a " + m + " metros.");

        teclado.close();
    }
}
