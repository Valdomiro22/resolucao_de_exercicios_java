package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio08 {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            double n1, n2, media;

            System.out.print("Nota 1: ");
            n1 = teclado.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("Nota invalida");
            } else {
                System.out.print("Nota 2: ");
                n2 = teclado.nextDouble();
                if (n2 < 0 || n2 > 10) {
                    System.out.println("Nota invalida");
                } else {
                    media = (n1 + n2) / 2;
                    System.out.println("Média = " + media);
                }
            }
            teclado.close();
        }
}
