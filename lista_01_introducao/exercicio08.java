package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float k, c;

        System.out.print("Digite a temperatura em graus Kelvin: ");
        k = teclado.nextFloat();

        c = k - 273.15F;

        System.out.println(k + " graus Kelvin equivalem a " + c + " graus Celsius.");

        teclado.close();
    }
}