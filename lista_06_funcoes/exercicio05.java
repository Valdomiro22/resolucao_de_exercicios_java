package resolucaoDeExerciciosJava.lista_06_funcoes;

import java.util.Scanner;

public class exercicio05 {

    static double volume(double r) {
        return (double) (4 / 3) * Math.PI * (r * r);
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double raio;

        System.out.println("Raio: ");
        raio = teclado.nextDouble();

        System.out.println("Volume: " + volume(raio));

        teclado.close();
    }
}
