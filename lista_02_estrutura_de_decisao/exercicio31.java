package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double altura, peso;

        System.out.print("Altura: ");
        altura = teclado.nextDouble();
        System.out.print("Peso: ");
        peso = teclado.nextDouble();

        if (altura < 1.2 && peso <= 60) {
            System.out.println("A");
        } else if (altura < 1.2 && (peso > 60 && peso <= 90)) {
            System.out.println("D");
        } else if (altura < 1.2 && peso > 90) {
            System.out.println("G");
        } else if (altura < 1.7 && peso <= 60) {
            System.out.println("B");
        } else if (altura < 1.7 && (peso > 60 && peso <= 90)) {
            System.out.println("E");
        } else if (altura < 1.7 && peso > 90) {
            System.out.println("H");
        }else if (altura > 1.7 && peso <= 60) {
            System.out.println("C");
        } else if (altura > 1.7 && (peso > 60 && peso <= 90)) {
            System.out.println("F");
        } else if (altura > 1.7 && peso > 90) {
            System.out.println("I");
        }
        teclado.close();
    }
}
