package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero, qtMultiplos=0;

        System.out.println("Numero: ");
        numero = teclado.nextInt();

        for (int i = numero; qtMultiplos == 0; i++) {
            if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                qtMultiplos++;
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
