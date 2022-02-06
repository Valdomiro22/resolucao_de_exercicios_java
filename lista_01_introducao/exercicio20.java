package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float k, l;

        System.out.print("Informe a masse em kilogramas: ");
        k = teclado.nextFloat();

        l = k / 0.45f;

        System.out.println(k + "kg equivalem a " + l + " libras.");

        teclado.close();
    }
}
