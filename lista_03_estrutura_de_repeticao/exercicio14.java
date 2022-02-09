package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();

        for (int i = n; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
