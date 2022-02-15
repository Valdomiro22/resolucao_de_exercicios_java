package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int[] vet = new int[5];
        int numero;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero: ");
            numero = teclado.nextInt();

            for (int j = 0; j < 5; j++) {
                while (vet[j] == numero) {
                    System.out.println("Número repetido. Digite outro");
                    numero = teclado.nextInt();
                }

                vet[i] = numero;
            }
        }

        for (int i : vet) {
            System.out.print(i + " ");
        }

        teclado.close();
    }
}
