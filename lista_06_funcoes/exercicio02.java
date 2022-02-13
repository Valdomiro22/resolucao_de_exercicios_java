package resolucaoDeExerciciosJava.lista_06_funcoes;

import java.util.Scanner;

public class exercicio02 {

    public static void dataPorExtenso(int dia, int mes, int ano) {
        switch (mes) {
            case 1 -> System.out.println(dia + " de janeiro de " + ano);
            case 2 -> System.out.println(dia + " de fevereiro de " + ano);
            case 3 -> System.out.println(dia + " de março de " + ano);
            case 4 -> System.out.println(dia + " de abril de " + ano);
            case 5 -> System.out.println(dia + " de maio de " + ano);
            case 6 -> System.out.println(dia + " de junho de " + ano);
            case 7 -> System.out.println(dia + " de julho de " + ano);
            case 8 -> System.out.println(dia + " de agostro de " + ano);
            case 9 -> System.out.println(dia + " de setembro de " + ano);
            case 10 -> System.out.println(dia + " de outubro de " + ano);
            case 11 -> System.out.println(dia + " de novembro de " + ano);
            case 12 -> System.out.println(dia + " de dezembro de " + ano);
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        dataPorExtenso(4, 2, 2031);

        teclado.close();
    }
}
