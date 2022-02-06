package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final float DIARIA = 30;
        int qtDiasTrabalhados;
        float quantidadeLiquida, valorBruto, desconto;

        System.out.print("Informe a quantidade de dias trabalhados: ");
        qtDiasTrabalhados = teclado.nextInt();

        valorBruto = qtDiasTrabalhados * DIARIA;
        desconto = valorBruto * 0.08f;
        quantidadeLiquida = valorBruto - desconto;

        System.out.println("Valor liquido a ser pago: " + quantidadeLiquida);

        teclado.close();
    }
}
