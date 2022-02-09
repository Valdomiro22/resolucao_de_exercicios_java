package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double x, y, z, geometrica, ponderada, harmonica, aritmetica;

        System.out.print("x: ");
        x = teclado.nextDouble();
        System.out.print("y: ");
        y = teclado.nextDouble();
        System.out.print("z: ");
        z = teclado.nextDouble();

//        geometrica = Math.pow((x * y * z), (double) (1 / 3));
        geometrica = Math.cbrt(x * y * z);
        ponderada = (x + (2 * y) + (3 * z)) / 6;
        harmonica = 1 / ((1 / x) + (1 / y) + (1 / z));
        aritmetica = (x + y + z) / 3;

        System.out.println("Geométrica = " + geometrica);
        System.out.println("Ponderada = " + ponderada);
        System.out.println("Harmônica = " + harmonica);
        System.out.println("Aritmética = " + aritmetica);

        teclado.close();
    }
}
