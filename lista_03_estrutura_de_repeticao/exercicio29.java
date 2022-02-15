package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int fatorial=1;
        double  s = 1.0;

            for (int i = 5; i >= 1 ; i--) {
                fatorial = fatorial * i;
//                System.out.println("Fatorial: " + fatorial);

                for (int j = 1; j <= 5; j++) {
                    s = (double) j / fatorial;
                    System.out.println(s);
                }
            }

        teclado.close();
    }
}
