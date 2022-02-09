package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numeros, menor = 0, maior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + " número: ");
            numeros = teclado.nextInt();

            if (numeros > maior) {
                maior = numeros;
            }

            if (numeros < menor || menor == 0) {
                menor = numeros;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        teclado.close();
    }
}
