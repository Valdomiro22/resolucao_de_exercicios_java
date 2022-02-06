package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, sucessor, triplo, soma;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        sucessor = (numero * 3) + 1;
        triplo = (numero - 1) * 3;
        soma = sucessor + triplo;

        System.out.println("Resultado = " + soma);

        teclado.close();
    }
}
