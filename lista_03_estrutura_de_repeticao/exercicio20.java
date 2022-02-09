package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numeros, qtNumeros = 0, qtPares = 0;

        System.out.print("Digite um número ou 1000 para finalizar: ");
        numeros = teclado.nextInt();
        if (numeros == 1000) {
            System.out.println("Finalizando sem calculos");
        } else {
            while (numeros != 1000) {
                qtNumeros++;

                if (numeros % 2 == 0) {
                    qtPares++;
                }

                System.out.print("Digite um número ou 1000 para finalizar: ");
                numeros = teclado.nextInt();
            }
        }

        System.out.println("Quantidade de valores lidos: " + qtNumeros);
        System.out.println("Quantidade de valores pares: " + qtPares);

        teclado.close();
    }
}
