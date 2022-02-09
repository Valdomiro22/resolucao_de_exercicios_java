package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = teclado.nextInt();

        if (numero > 0 && numero < 10) {
            System.out.println(numero);
        } else if (numero >= 10 && numero < 100) {
            int dezena, unidade;

            unidade = numero % 10;
            dezena = (numero / 10) % 10;

            System.out.println(unidade + dezena);
        } else if (numero >= 10 && numero < 1000) {
            int dezena, unidade, centena;

            unidade = numero % 10;
            dezena = (numero / 10) % 10;
            centena = (numero / 100) % 10;

            System.out.println(unidade + dezena + centena);
        } else if (numero >= 100 && numero < 10000) {
            int dezena, unidade, centena, milhar;

            unidade = numero % 10;
            dezena = (numero / 10) % 10;
            centena = (numero / 100) % 10;
            milhar = (numero / 1000) % 10;

            System.out.println(unidade + dezena + centena + milhar);
        }
        teclado.close();
    }
}
