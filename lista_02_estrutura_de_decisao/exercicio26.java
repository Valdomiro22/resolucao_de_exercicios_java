package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double distancia, qtLitros, consumo;

        System.out.print("Distencia em km: ");
        distancia = teclado.nextDouble();
        System.out.print("Quantidade de litros consumidos: ");
        qtLitros = teclado.nextDouble();

        consumo = distancia / qtLitros;

        if (consumo < 8) {
            System.out.println("Venda o carro");
        } else if (consumo <= 12) {
            System.out.println("Economico");
        } else {
            System.out.println("Super economico");
        }

        teclado.close();
    }
}
