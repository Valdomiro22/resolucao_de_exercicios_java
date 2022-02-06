package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float salario, novoSalario, aumento;

        System.out.print("Informe o salario do funcionario: ");
        salario = teclado.nextFloat();

        aumento = salario * 0.25f;
        novoSalario = salario + aumento;

        System.out.println("Novo salario: " + novoSalario);

        teclado.close();
    }
}
