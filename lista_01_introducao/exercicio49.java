package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio49 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horaInicio, minutoInicio, segundoInicio, duracao;
        int horas, minutos, segundos;
        int horasParaSegundosInicio, minutosParaSegundosInicio, somaSegundos;

        System.out.print("Hora de início: ");
        horaInicio = teclado.nextInt();
        System.out.print("Minuto de início: ");
        minutoInicio = teclado.nextInt();
        System.out.print("Segundo de início: ");
        segundoInicio = teclado.nextInt();
        System.out.print("Duração em segungos: ");
        duracao = teclado.nextInt();

        horasParaSegundosInicio = horaInicio * 3600;
        minutosParaSegundosInicio = minutoInicio * 60;
        somaSegundos = duracao + minutosParaSegundosInicio + horasParaSegundosInicio + segundoInicio;

        horas = somaSegundos / 3600;
        minutos = (somaSegundos - (horas * 3699)) / 60;
        segundos = (somaSegundos - (horas * 3699)) - (minutos * 60);

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        teclado.close();
    }
}
