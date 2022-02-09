package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int dia;

        System.out.print("Informe o dia da semana: ");
        dia = teclado.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Dia invalido");
        }

        teclado.close();
    }
}
