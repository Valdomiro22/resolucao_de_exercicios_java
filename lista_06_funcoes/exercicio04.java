package resolucaoDeExerciciosJava.lista_06_funcoes;

import java.util.Scanner;

public class exercicio04 {

    static void quadradoPerfeito(int n) {
        double numero = Math.sqrt(n);

        if (Math.pow(numero, 2) == n) {
            System.out.println("Quadrado perfeito");
        }else {
            System.out.println("Não é quadrado perfeito");
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = teclado.nextInt();

        quadradoPerfeito(numero);

        teclado.close();
    }
}
