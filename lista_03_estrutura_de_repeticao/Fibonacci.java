package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            int a=1, b=0, c=0;

            for (int i = 0; i < 30; i++) {
                c = a;
                a = a + b;
                b = c;

                System.out.println(a);
            }

            teclado.close();
        }
}
