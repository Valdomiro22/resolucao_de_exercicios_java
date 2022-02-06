package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float f, c;

        System.out.print("Digite a temperatura em fahrenheit: ");
        f = teclado.nextFloat();

        c = 5 * (f - 32) / 9;

        System.out.println(f + " graus fahrenheit equivalem a " + c + " graus celcius.");

        teclado.close();
    }
}

