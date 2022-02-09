package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int ano;

        System.out.print("Informe o ano: ");
        ano = teclado.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("É um ano bisexto");
        } else {
            System.out.println("Não é um ano bisexto");
        }

        teclado.close();
    }
}
