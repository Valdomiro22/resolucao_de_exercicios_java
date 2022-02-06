package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a, m;

        System.out.print("Informe a área em acres: ");
        a = teclado.nextFloat();

        m = a * 4048.58f;

        System.out.println(a + " acres equivalem a " + m + " metros quadrados.");

        teclado.close();
    }
}
