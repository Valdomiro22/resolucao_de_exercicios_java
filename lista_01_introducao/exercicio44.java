package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float alturaDegrau, alturaDesejada;
        int qtDegraus;

        System.out.print("Altura de cada degrau: ");
        alturaDegrau = teclado.nextFloat();
        System.out.print("Altura que se deseja alcansar: ");
        alturaDesejada = teclado.nextFloat();

        qtDegraus = (int) Math.ceil(alturaDegrau * alturaDesejada);

        System.out.println("Será necessario subir: " + qtDegraus + " degraus.");

        teclado.close();
    }
}
