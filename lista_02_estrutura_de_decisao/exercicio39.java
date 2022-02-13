package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double salarioAtual, novoSalario = 0, reajuste = 0;
        int anosDeServico, bonus = 0;

        System.out.print("Salario atual: ");
        salarioAtual = teclado.nextDouble();
        System.out.print("Tempo de seriço: ");
        anosDeServico = teclado.nextInt();

        if (salarioAtual <= 500 && anosDeServico < 1) {
            reajuste = salarioAtual * 0.25;
        } else if (salarioAtual <= 1000 && anosDeServico <= 3) {
            reajuste = salarioAtual * 0.20;
            bonus = 100;
        } else if (salarioAtual <= 1500 && anosDeServico <= 6) {
            reajuste = salarioAtual * 0.15;
            bonus = 200;
        } else if (salarioAtual <= 2000 && anosDeServico <= 10) {
            reajuste = salarioAtual * 0.10;
            bonus = 300;
        } else if (salarioAtual > 2000 && anosDeServico > 10) {
            reajuste = 0;
            bonus = 5000;
        }

        novoSalario = salarioAtual + reajuste + bonus;
        System.out.println("Novo salario: " + novoSalario);

        teclado.close();
    }
}
