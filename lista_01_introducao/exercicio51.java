package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio51 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x, y, distancia;

        System.out.print("X = ");
        x = teclado.nextDouble();
        System.out.print("Y = ");
        y = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));

        System.out.printf("Distancia = %.2f", distancia);

        teclado.close();
    }
}
