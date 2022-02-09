package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int qt = 50, i = 1, soma = 0;

        while (qt >= 0) {
            if (i % 2 == 0) {
                soma += i;
                qt--;
            }
            i++;
        }

        System.out.println("Soma = " + soma);

        teclado.close();
    }
}
