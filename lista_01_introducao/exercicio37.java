package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valorProduto, valorComDesconto, desconto;

        System.out.print("Informe o valor do produto: ");
        valorProduto = teclado.nextFloat();

        desconto = valorProduto * 0.12f;
        valorComDesconto = valorProduto - desconto;

        System.out.println("Valor do produto com desconto: " + valorComDesconto);

        teclado.close();
    }
}
