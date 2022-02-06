package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float m, l;

        System.out.print("Informe o volume em metros cubicos: ");
        m = teclado.nextFloat();

        l = m * 1000;

        System.out.println(m + " metros cúbicos equivalem a " + l + " litros.");

        teclado.close();
    }
}
