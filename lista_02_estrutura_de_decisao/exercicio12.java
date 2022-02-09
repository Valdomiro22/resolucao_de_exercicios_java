package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;
        double logaritmo;

        System.out.println("Informe um número inteiro: ");
        numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Número invalido");
        } else {
            logaritmo = Math.log(numero);
            System.out.println("Logaritmo de " + numero + " = " + logaritmo);
        }

        teclado.close();
    }
}
