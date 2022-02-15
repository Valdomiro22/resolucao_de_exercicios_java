package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = {654, 34, 632, 5326 , 4, 75, 3742, 112, 87, 53};
        int x;

        System.out.println("Valor de x: ");
        x = teclado.nextInt();

        for (int numero : numeros) {
            if (numero % x == 0) {
                System.out.println(numero);
            }
        }

        teclado.close();
    }
}
