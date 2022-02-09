package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + " : ");
            numero = teclado.nextInt();

            soma += numero;
        }

        System.out.println("Total da soma: " + soma);

        teclado.close();
    }
}
