package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float l, m;

        System.out.print("Digite o volume em litros: ");
        l = teclado.nextFloat();

        m = l / 1000;

        System.out.println(l + " litros equivalem a " + m + " metros cúbicos");

        teclado.close();
    }
}
