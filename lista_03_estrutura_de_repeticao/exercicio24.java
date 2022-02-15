package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero, soma=0;

        System.out.println("Informe um numero positivo: ");
        numero = teclado.nextInt();

        for (int i = 1; i < numero; i ++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
