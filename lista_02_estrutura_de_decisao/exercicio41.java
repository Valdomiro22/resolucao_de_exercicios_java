package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio41 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Peso: ");
        peso = teclado.nextDouble();
        System.out.print("Altura: ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Peso em excesso");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II (Severa)");
        } else if (imc > 40) {
            System.out.println("Obesidade grau III (Morbida)");
        }

        teclado.close();
    }
}
