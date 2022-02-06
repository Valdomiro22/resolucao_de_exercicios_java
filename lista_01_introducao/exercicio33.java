package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float lado, area;

        System.out.print("Informe o valor do lado: ");
        lado = teclado.nextFloat();

        area = lado * lado;

        System.out.print("Area do quadrado: " + area);

        teclado.close();
    }
}
