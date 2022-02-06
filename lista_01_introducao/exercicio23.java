package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, j;

        System.out.print("Informe o comprimento em metros: ");
        m = teclado.nextFloat();

        j = m / 0.91f;

        System.out.println(m + " metros equivalem a " + j + " jardas.");

        teclado.close();
    }
}
