package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vl1, vl2, vl3, somaQuadrados;

        System.out.print("Informe o primeiro valor: ");
        vl1 = teclado.nextInt();
        System.out.print("Informe o segundo valor: ");
        vl2 = teclado.nextInt();
        System.out.print("Informe o terceiro valor: ");
        vl3 = teclado.nextInt();

        somaQuadrados = (vl1 * vl1) + (vl2 * vl2) + (vl3 * vl3);

        System.out.println("A soma dos quadrados destes numeros é: " + somaQuadrados);

        teclado.close();
    }
}
