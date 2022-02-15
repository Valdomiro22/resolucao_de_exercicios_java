package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Random;
import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random vezes = new Random();

        int d1, d2, n=5;

        for (int i=0; i<n; i++) {
            d1 = vezes.nextInt(6);
            d2 = vezes.nextInt(6);

            if (d1 > d2) {
                System.out.println("D1 é maior que D2");
            } else if (d2 > d1) {
                System.out.println("D2 é maior que D1");
            } else {
                System.out.println("D1 = D2");
            }
        }

        teclado.close();
    }
}
