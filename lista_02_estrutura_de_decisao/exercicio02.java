package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numero, raiz;

        System.out.print("Digite um numero: ");
        numero = teclado.nextFloat();

        if (numero > 0) {
            raiz = (float) Math.sqrt(numero);
            System.out.println("Raiz quandrado de " + numero + " = " + raiz);
        } else {
            System.out.println("Numero inválido");
        }

        teclado.close();
    }
}
