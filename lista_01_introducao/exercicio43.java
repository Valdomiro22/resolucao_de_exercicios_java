package resolucaoDeExerciciosJava.lista_01_introducao;

import java.util.Scanner;

public class exercicio43 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float total, conDesconto10, parcelaEm3x, comicaoVista5ComDesconto, comicaoParcela5Total;

        System.out.print("Informe valor total: ");
        total = teclado.nextFloat();

        conDesconto10 = total - (total * 0.01f);
        parcelaEm3x = total / 3;
        comicaoVista5ComDesconto = conDesconto10 * 0.05f;
        comicaoParcela5Total = total * 0.05f;

        System.out.println("Total a pagar com descomto de 10%: " + conDesconto10);
        System.out.println("Valor de cada parcela no parcelamento em 3x sem juros: " + parcelaEm3x);
        System.out.println("Comição caso seja a vista: " + comicaoVista5ComDesconto);
        System.out.println("Comição case seja parcelado: " + comicaoParcela5Total);

        teclado.close();
    }
}
