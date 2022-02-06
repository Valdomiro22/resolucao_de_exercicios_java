package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float h, r, v;

        System.out.print("Informe a altura: ");
        h = teclado.nextFloat();
        System.out.print("Informe o raio: ");
        r = teclado.nextFloat();

        v = (float) Math.PI * r * r * h;

        System.out.println("Volume: " + v);

        teclado.close();
    }
}
