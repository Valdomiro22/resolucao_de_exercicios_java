package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salarioBase, salarioReceber, gratificacao, imposto;

        System.out.print("Informe o salario base: ");
        salarioBase = teclado.nextFloat();

        gratificacao = salarioBase * 0.05f;
        imposto = salarioBase * 0.07f;
        salarioReceber = salarioBase + gratificacao - imposto;

        System.out.println("Salario à receber: " + salarioReceber);

        teclado.close();
    }
}
