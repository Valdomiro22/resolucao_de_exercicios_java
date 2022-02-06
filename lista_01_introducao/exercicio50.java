package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio50 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anoAtual, idade, anoNacimento;

        System.out.print("Sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Ano atual: ");
        anoAtual = teclado.nextInt();

        anoNacimento = anoAtual - idade;

        System.out.println("Ano de nacimento: " + anoNacimento);

        teclado.close();
    }
}
