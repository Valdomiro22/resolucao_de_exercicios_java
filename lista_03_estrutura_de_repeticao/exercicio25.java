package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int soma=0;

        for (int i = 1; i < 1000; i ++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("Soma: " + soma);

        teclado.close();
    }
}
