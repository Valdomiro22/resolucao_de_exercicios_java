package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vl1, vl2, vl3, soma;

        System.out.print("Digite um valor inteiro: ");
        vl1 = teclado.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        vl2 = teclado.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        vl3 = teclado.nextInt();

        soma = vl1 + vl2 + vl3;

        System.out.println("A soma dos valores digitados é: " + soma);


        teclado.close();
    }
}
