package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.print("Digite um numero: ");
        numero = teclado.nextDouble();

        if (numero > 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("Raiz = " + raiz);
        } else if (numero < 0) {
            double quadrado = Math.pow(numero, 2);
            System.out.println("Raiz = " + quadrado);
        } else {
            System.out.println("Número Invalido");
        }

        teclado.close();
    }
}
