package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double[] valores = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Valor da posição [%d]: ", i + 1);
            valores[i] = teclado.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i]);
        }


        teclado.close();
    }
}
