package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio48 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, horas, minutos, segundos;

        System.out.print("Quantidade de segundos: ");
        valor = teclado.nextInt();

        horas = valor / 3600;
        minutos = (valor - (horas * 3600)) / 60;
        segundos = (valor - (horas * 3600)) - (minutos * 60);

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segungos: " + segundos);

        teclado.close();
    }
}
