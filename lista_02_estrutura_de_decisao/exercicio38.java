package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final int ANO_ATUAL = 2008;
        int dia, mes, ano;
        boolean anoBisexto = false;

        System.out.print("Digite o dia: ");
        dia = teclado.nextInt();
        if (dia < 1 || dia > 31) {
            System.out.println("Dia invalido.");
            System.out.println("Data invalida");
            System.exit(0);
        }

        System.out.print("Digite o mes: ");
        mes = teclado.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mês invalido.");
            System.out.println("Data invalida");
            System.exit(0);
        }

        System.out.print("Digite o ano: ");
        ano = teclado.nextInt();
        if (ano < 1 || ano > ANO_ATUAL) {
            System.out.println("Ano invalido.");
            System.out.println("Data invalida");
            System.exit(0);
        }

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            anoBisexto = true;
        }

        if (!anoBisexto && dia > 28) {
            System.out.println("Data invalida");
            System.exit(0);
        } else if (anoBisexto && dia > 29) {
            System.out.println("Data invalida");
            System.exit(0);
        } else {
            System.out.println("Data valida");
        }

        teclado.close();
    }
}
