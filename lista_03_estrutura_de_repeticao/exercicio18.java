package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n,numero, maior = 0, qtVezes = 0;

        System.out.print("Informe a quantidade de números: ");
        n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o " + (i + 1) + " número: ");
            numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
                qtVezes++;
            }
        }

        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Quantidade de vezes que o maior foi lido: " + qtVezes);

        teclado.close();
    }
}
