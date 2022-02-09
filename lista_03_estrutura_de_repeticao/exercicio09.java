package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Digite o limite: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
