package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float c, f;

        System.out.print("Digite a temperatura em graus Celsius: ");
        c = teclado.nextFloat();

        f = (c * (9.0f / 5.0f)) + 32;

        System.out.print(c + " graus Celsius equivale a " + f + " graus Fahrenheit");

        teclado.close();
    }
}