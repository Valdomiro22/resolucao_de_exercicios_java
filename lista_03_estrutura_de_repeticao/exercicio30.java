package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a=-1, b=0, c=0;

        for (int i = 1; i < 30; i++) {
            a += 2;
            b -= 2;

            System.out.println();
            System.out.print(i + " ");
            System.out.print(a + " ");
            System.out.print(b + " ");
        }

        teclado.close();
    }
}
