package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int fatorial=5;
        int resposta=1;

        for (; fatorial >= 1; --fatorial) {
            resposta *= fatorial;
            System.out.println(resposta);
        }




        int n, num, fatorial2=1;
        double  e = 1.0;

        for (int j = 1; j <= 5; j++) {
            System.out.println("Fatorial de " + j);
            for (int i = j; i >= j ; i--) {
                fatorial2 = fatorial2 * i;
//                System.out.println("Fatorial de 5: " + fatorial);
                System.out.println(fatorial2);
            }
        }

        teclado.close();
    }
}
