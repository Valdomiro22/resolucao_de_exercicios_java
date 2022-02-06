package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, h;

        System.out.print("Informe a área em metros quadrados: ");
        m = teclado.nextFloat();

        h = m * 0.0001f;

        System.out.println(m + " metros quadrados equivalem a " + h + " hectares: ");

        teclado.close();
    }
}
