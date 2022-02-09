package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        double valorAPagar;

        System.out.print("Codigo do produto: ");
        codigo = teclado.nextInt();
        if (codigo < 100 || codigo > 106) {
            System.out.println("Código invalido");
        } else {
            System.out.print("Quantidade: ");
            quantidade = teclado.nextInt();

            if (codigo == 100) {
                valorAPagar = quantidade * 1.2;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else if (codigo == 101) {
                valorAPagar = quantidade * 1.3;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else if (codigo == 102) {
                valorAPagar = quantidade * 1.5;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else if (codigo == 103) {
                valorAPagar = quantidade * 1.2;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else if (codigo == 104) {
                valorAPagar = quantidade * 1.7;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else if (codigo == 105) {
                valorAPagar = quantidade * 1.2;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            } else {
                valorAPagar = quantidade * 1.0;
                System.out.printf("Valor a ser pago: %.2f", valorAPagar);
            }
        }

        teclado.close();
    }
}
