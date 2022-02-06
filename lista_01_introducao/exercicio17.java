package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float c, p;

        System.out.print("Informe o comprimento em centimetros: ");
        c = teclado.nextFloat();

        p = c / 2.54f;

        System.out.println(c + " centimetros equivalem a " + p + " polegadas.");

        teclado.close();
    }
}
