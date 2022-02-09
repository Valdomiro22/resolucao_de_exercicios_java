package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero, unidade, dezena, centena;

        System.out.print("Digite um numero de 3 digitos: ");
        numero = teclado.nextInt();

        unidade = numero % 10;
        dezena = (numero / 10) % 10;
        centena = (numero / 100) % 10;

        System.out.printf("%d %d %d", centena, dezena, unidade);

        teclado.close();
    }
}
