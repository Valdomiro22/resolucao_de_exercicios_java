package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a, b, h;

        System.out.print("Digite o valor do cateto A: ");
        a = teclado.nextFloat();
        System.out.print("Digite o valor do cateto B: ");
        b = teclado.nextFloat();

        h = (float) Math.sqrt((a * a) + (b * b));

        System.out.println("Valor da hipotenusa: " + h);

        teclado.close();
    }
}
