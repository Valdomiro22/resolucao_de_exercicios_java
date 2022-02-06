package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float real, cotacaoDolar, dolares;

        System.out.print("Digite um valor em reais: ");
        real = teclado.nextFloat();
        System.out.print("Digite a cotação do dolar: ");
        cotacaoDolar = teclado.nextFloat();

        dolares = real * cotacaoDolar;

        System.out.println(real + " reais equivalem a " + dolares + " dolares.");

        teclado.close();
    }
}
