package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numero;

        System.out.print("Numero: ");
        numero = teclado.nextFloat();

        if (numero > 0) {
            float quadrado = (float) Math.pow(numero, 2);
            float raiz = (float) Math.sqrt(numero);

            System.out.println("Quadrado: " + quadrado);
            System.out.println("Quadrado: " + raiz);
        } else {
            System.out.println("Número invalido");
        }

        teclado.close();
    }
}
