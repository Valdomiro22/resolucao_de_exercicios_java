package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char letra;

        System.out.print("Digite uma letra minuscula: ");
        letra = teclado.next().charAt(0);

        System.out.println(letra + " em maiuscula: " + (char) (letra - 32));

        teclado.close();
    }
}
