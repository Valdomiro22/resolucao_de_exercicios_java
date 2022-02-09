package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        System.out.print("Base maior: ");
        baseMaior = teclado.nextDouble();
        if (baseMaior <= 0) {
            System.out.println("O valor de uma base não pode ser menor que zero");
        } else {
            System.out.print("Base menor: ");
            baseMenor = teclado.nextDouble();
            if (baseMenor <= 0) {
                System.out.println("O valor de uma base não pode ser menor que zero");
            } else {
                System.out.print("Altura: ");
                altura = teclado.nextDouble();
                if (altura <= 0) {
                    System.out.println("A altura não pode ser zero");
                } else {
                    area = ((baseMaior + baseMenor) * altura) / 2;
                    System.out.println("Area = " + area);
                }
            }
        }
        teclado.close();
    }
}
