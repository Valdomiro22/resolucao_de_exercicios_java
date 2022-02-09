package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int dia, mes, ano;
        boolean bisexto = false;

        System.out.print("Informe o ano: ");
        ano = teclado.nextInt();
        System.out.print("Informe o mês: ");
        mes = teclado.nextInt();
        System.out.print("Informe o dia: ");
        dia = teclado.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            bisexto = true;
        }

        if (mes < 1 || mes > 12) {
            System.out.println("Mês invalido");
        }

        if (mes == 2 && !bisexto && dia > 28) {
            System.out.println("Dia invalido! O ano não é bisexto");
        }

        if (mes == 1 && dia > 32) {
            System.out.println("Dia invalido");
        } else if (mes == 2 && dia > 29) {
            System.out.println("Dia invalido");
        } else if (mes == 3 && dia > 31) {
            System.out.println("Dia invalido");
        } else if (mes == 4 && dia > 30) {
            System.out.println("Dia invalido");
        } else if (mes == 5 && dia > 31) {
            System.out.println("Dia invalido");
        } else if (mes == 6 && dia > 30) {
            System.out.println("Dia invalido");
        } else if (mes == 7 && dia > 31) {
            System.out.println("Dia invalido");
        } else if (mes == 8 && dia > 31) {
            System.out.println("Dia invalido");
        } else if (mes == 9 && dia > 30) {
            System.out.println("Dia invalido");
        } else if (mes == 10 && dia > 31) {
            System.out.println("Dia invalido");
        } else if (mes == 11 && dia > 30) {
            System.out.println("Dia invalido");
        } else if (mes == 12 && dia > 31) {
            System.out.println("Dia invalido");
        } else {
            System.out.println("Data valida");
            System.out.printf("%d/%d/%d", dia, mes, ano);
        }

        teclado.close();
    }
}
