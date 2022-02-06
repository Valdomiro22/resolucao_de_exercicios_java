package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio46 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, unidade, dezena, centena;

        System.out.print("Infome um numero: ");
        numero = teclado.nextInt();

        unidade = numero % 10;
        dezena = (numero / 10) % 10;
        centena = (numero / 100) % 10;

        System.out.print(unidade + "" + dezena + "" + centena);

        teclado.close();
    }
}
