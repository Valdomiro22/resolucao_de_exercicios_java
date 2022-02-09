package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio09 {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            double salario, prestacao, porcentagem;

            System.out.print("Salario: ");
            salario = teclado.nextDouble();
            System.out.print("Prestação: ");
            prestacao = teclado.nextDouble();

            porcentagem = salario * 0.20;

            if (prestacao > porcentagem) {
                System.out.println("Emprestimo não consedido");
            } else {
                System.out.println("Emprestimo consedido");
            }

            teclado.close();
        }
}
