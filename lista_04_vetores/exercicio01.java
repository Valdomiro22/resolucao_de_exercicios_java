package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] a = new int[6];

        a[0] = 1;
        a[1] = 0;
        a[2] = 5;
        a[3] = -2;
        a[4] = -5;
        a[5] = 7;

        int soma = a[0] + a[1] + a[5];

        a[4] = 100;

        for (int i=0; i<6; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Soma: " + soma);

        teclado.close();
    }
}
