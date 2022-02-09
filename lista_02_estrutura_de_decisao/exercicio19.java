package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        if (numero % 3 == 0 || numero % 5 == 0) {
            System.out.println("É divizivel");
        }

        teclado.close();
    }
}
