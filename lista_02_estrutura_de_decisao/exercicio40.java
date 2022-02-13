package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double custaDeFabrica, custoAoConsumidor, comicaoDistribuidor=0, impostos=0;

        System.out.print("Custo de fabrica: ");
        custaDeFabrica = teclado.nextDouble();

        if (custaDeFabrica < 12000) {
            comicaoDistribuidor = custaDeFabrica * 0.05;
        } else if (custaDeFabrica < 25000) {
            comicaoDistribuidor = custaDeFabrica * 0.1;
            impostos = custaDeFabrica * 0.15;
        } else {
            comicaoDistribuidor = custaDeFabrica * 0.15;
            impostos = custaDeFabrica * 0.2;
        }

        custoAoConsumidor = custaDeFabrica + comicaoDistribuidor + impostos;
        System.out.println("Custo ao consumidor: " + custoAoConsumidor);

        teclado.close();
    }
}
