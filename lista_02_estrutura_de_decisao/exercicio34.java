package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int nota, faltas;

        System.out.print("Nota: ");
        nota = teclado.nextInt();
        System.out.print("Faltas: ");
        faltas = teclado.nextInt();

        if (nota < 4 && faltas <= 20) {
            System.out.println("E");
        } else if (nota < 4) {
            System.out.println("E");
        } else if (nota < 5 && faltas <= 20) {
            System.out.println("D");
        } else if (nota < 5) {
            System.out.println("E");
        } else if (nota < 7.5 && faltas <= 20) {
            System.out.println("C");
        } else if (nota < 7.5) {
            System.out.println("D");
        } else if (nota < 9 && faltas <= 20) {
            System.out.println("B");
        } else if (nota < 9) {
            System.out.println("C");
        } else if (nota < 10 && faltas <= 20) {
            System.out.println("A");
        } else if (nota < 10) {
            System.out.println("B");
        }

        teclado.close();
    }
}
