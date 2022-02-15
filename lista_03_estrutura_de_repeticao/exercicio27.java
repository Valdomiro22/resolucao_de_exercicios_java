package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;
        double h=0.0;

        System.out.println("Valor de n: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            h = (double) 1/i;
        }

        System.out.println(h);

        teclado.close();
    }
}
