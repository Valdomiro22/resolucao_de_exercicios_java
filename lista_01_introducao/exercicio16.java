package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float p, c;

        System.out.print("Informe o comprimento em polegadas: ");
        p = teclado.nextFloat();

        c = p * 2.54f;

        System.out.println(p + " polegadas equivalem a " + c + " centimetros.");

        teclado.close();
    }
}
