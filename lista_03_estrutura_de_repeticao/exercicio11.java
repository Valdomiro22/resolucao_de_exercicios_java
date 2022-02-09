package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Informe o valor de n: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}
