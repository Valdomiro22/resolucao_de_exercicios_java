package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n, soma = 0;

        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
