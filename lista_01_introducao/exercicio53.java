package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio53 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float c, l, p, custo;

        System.out.print("Comprimento: ");
        c = teclado.nextFloat();
        System.out.print("Largura: ");
        l = teclado.nextFloat();
        System.out.print("Preço do metro de tela: ");
        p = teclado.nextFloat();

        custo = (c + l) * p;

        System.out.println("Vai custar: " + custo);

        teclado.close();
    }
}

