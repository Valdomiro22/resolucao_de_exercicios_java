package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float raio, area;

        System.out.print("Raio do círculo: ");
        raio = teclado.nextFloat();

        area = (float) Math.PI * (raio * raio);

        System.out.println("Área do círculo: " + area);

        teclado.close();
    }
}
