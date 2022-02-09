package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, c;

        System.out.print("A: ");
        a = teclado.nextDouble();
        System.out.print("B: ");
        b = teclado.nextDouble();
        System.out.print("C: ");
        c = teclado.nextDouble();

        if (a < (a + b) && b < (a + c) && c < (a + b)) {
            System.out.println("É um triângulo");

            if (a == b && a == c) {
                System.out.println("Equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isóceles");
            } else {
                System.out.println("Escaleno");
            }
        }
        teclado.close();
    }
}
