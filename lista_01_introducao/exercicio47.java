package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio47 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, unidade, dezena, centena, milhar;

        System.out.print("Digite um numero de quatro digitos: ");
        n = teclado.nextInt();

        unidade = n % 10;
        dezena = (n / 10) % 10;
        centena = (n / 100) % 10;
        milhar = (n / 1000) % 10;

        System.out.println(milhar);
        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);

        teclado.close();
    }
}
