package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float c, k;

        System.out.print("Digite a temperatura em Celsius: ");
        c = teclado.nextFloat();

        k = c + 273.15f;

        System.out.println(c + " graus Celsius equivalem a " + k + " graus Kelvin.");

        teclado.close();
    }
}

