package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n=5, i=3, j, qt = 1;

//        System.out.println("Valor de i: ");
//        i = teclado.nextInt();
//        System.out.println("Valor de j: ");
//        j = teclado.nextInt();
//        System.out.println("Quantidade de números: ");
//        n = teclado.nextInt();

        while (n > 0) {
            if (qt % n == 0) {
                System.out.println(qt);
                n--;
            }

            qt++;
        }

        teclado.close();
    }
}
