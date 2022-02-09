package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int idade, tempoServico;

        System.out.print("Idade: ");
        idade = teclado.nextInt();
        System.out.print("Tempo de Cerviço: ");
        tempoServico = teclado.nextInt();

        if (idade >= 65 || tempoServico >= 30 || (idade == 60 && tempoServico >= 25)) {
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Não pode se aposentar");
        }

        teclado.close();
    }
}
