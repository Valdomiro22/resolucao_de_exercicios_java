package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int horaChegada, minutoChegada;
        int horaSaida, minutoSaida;
        int horaPermanencia, minutoPermanencia, totalPermanencia;
        double valorAPagar;

        System.out.print("Hora de chegada: ");
        horaChegada = teclado.nextInt();
        if (horaChegada < 0 || horaChegada > 24) {
            System.out.println("Hora invalida.");
        } else {
            System.out.print("Minuto de chegada: ");
            minutoChegada = teclado.nextInt();
            if (minutoChegada < 0 || minutoChegada > 60) {
                System.out.println("Hora invalida.");
            } else {
                System.out.print("Hora de saida: ");
                horaSaida = teclado.nextInt();
                if (horaSaida < 0 || horaSaida > 60) {
                    System.out.println("Hora invalida.");

                } else {
                    System.out.print("Minuto de saida: ");
                    minutoSaida = teclado.nextInt();
                    if (minutoSaida < 0 || minutoSaida > 60) {
                        System.out.println("Hora invalida.");
                    } else  {
                        if (horaChegada > horaSaida) {
                            horaPermanencia = Math.abs(horaChegada - horaSaida) + 24;
                        } else {
                            horaPermanencia = Math.abs(horaChegada - horaSaida);
                        }

                        minutoPermanencia = Math.abs(minutoChegada - minutoSaida);

                        if ( minutoPermanencia > 0) {
                            horaPermanencia += 1;
                        }

                        if (horaPermanencia <= 2) {
                            valorAPagar = horaPermanencia;
                        } else if (horaPermanencia <= 4) {
                            valorAPagar = horaPermanencia * 1.4;
                        } else {
                            valorAPagar = horaPermanencia * 2;
                        }

                        System.out.println("Total a pagar: " + valorAPagar);
                    }
                }
            }
        }

        teclado.close();
    }
}
