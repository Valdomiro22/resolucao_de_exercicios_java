package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a=-1;
        double b;

        for (int i = 1; i < 30; i++) {
            a += 2;
            b = (double) a/i;

            System.out.println(b);
        }

        teclado.close();
    }
}
