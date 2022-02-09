package resolucaoDeExerciciosJava.lista_07_classes;

import java.sql.Array;
import java.util.Scanner;

public class AgendaEstruturada {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            int qtPessoas[] = new int[3];
            String nome;
            int idade;
            double altura;

            for (int i = 0; i < qtPessoas.length; i++) {
                System.out.print("Digite o nome: ");
                nome = teclado.next();
                System.out.print("Digite a idade: ");
                idade = teclado.nextInt();
                System.out.print("Digite a altura: ");
                altura = teclado.nextDouble();

            }

            teclado.close();
        }
}
