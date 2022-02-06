package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtHorasTrabalhadas;
        float valorHora, valorBruto, valorPago, adicionar;

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        qtHorasTrabalhadas = teclado.nextInt();
        System.out.print("Informe o valor da hora: ");
        valorHora = teclado.nextFloat();

        valorBruto = qtHorasTrabalhadas * valorHora;
        adicionar = valorBruto * 0.01f;
        valorPago = valorBruto + adicionar;

        System.out.println("Valor a ser pago: " + valorPago);

        teclado.close();
    }
}
