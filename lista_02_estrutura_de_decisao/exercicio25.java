package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Valor de a: ");
        a = teclado.nextDouble();
        if (a == 0) {
            System.out.println("Não é equação do segundo grau");
        } else {
            System.out.print("Valor de b: ");
            b = teclado.nextDouble();
            System.out.print("Valor de c: ");
            c = teclado.nextDouble();

            delta = (b * b) - (4 * a * c);

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            if (delta < 0) {
                System.out.println("Não existe raiz");
            } else if (delta == 0) {
                System.out.println("Raiz única");
                System.out.println("X1 = " + x1);
            } else if (delta >= 0){
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }

        teclado.close();
    }
}
