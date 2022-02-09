package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double precoAntigo, precoNovo;

        System.out.print("Preço antigo: ");
        precoAntigo = teclado.nextDouble();

        if (precoAntigo <= 50) {
            precoNovo = precoAntigo + (precoAntigo * 0.05);
            System.out.println("Novo preço: " + precoNovo);
        } else if (precoAntigo <= 100) {
            precoNovo = precoAntigo + (precoAntigo * 0.1);
            System.out.println("Novo preço: " + precoNovo);
        } else if (precoAntigo > 100) {
            precoNovo = precoAntigo + (precoAntigo * 0.15);
            System.out.println("Novo preço: " + precoNovo);
        }

        teclado.close();
    }
}
