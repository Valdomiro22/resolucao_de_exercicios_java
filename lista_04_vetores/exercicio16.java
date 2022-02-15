package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] vetor = {64, 34.6, 32.1, 56.1 , 4};
        int codigo;

        System.out.println("Codigo: ");
        codigo = teclado.nextInt();
        if (codigo < 0 || codigo > 2) {
            System.out.println("Codigo invalido");
        } else if (codigo == 0) {
            System.out.println("Finalizando");
        } else  if (codigo == 1) {
            for (double num : vetor) {
                System.out.println(num);
            }
        } else {
            for (int i = vetor.length - 1; i > 0; i--) {
                System.out.println(vetor[i]);
            }
        }

        teclado.close();
    }
}
