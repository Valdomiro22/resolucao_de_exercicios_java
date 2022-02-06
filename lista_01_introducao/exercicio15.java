package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double r, g;

        System.out.print("Digite o angulo em radianos: ");
        r = teclado.nextDouble();

        g = r * 180 / Math.PI;

        System.out.println(r + " radianos equivalem a " + g + " graus.");

        teclado.close();
    }
}
