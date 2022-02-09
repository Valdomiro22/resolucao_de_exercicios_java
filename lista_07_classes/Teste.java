package resolucaoDeExerciciosJava.lista_07_classes;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Veiculo[] carro[] = new Veiculo[5];

        for (int i = 0; i < 5; i++) {
            carro[i] = new Veiculo();

            System.out.print("Nome: ");
            String nomeCarro = teclado.next();
            System.out.print("Placa: ");
            String placaCarro = teclado.next();
            System.out.print("Serie: ");
            int serieCarro = teclado.nextInt();

            carro[i].nome = nomeCarro;
            carro[i].placa = placaCarro;
            carro[i].serie = serieCarro;
        }

        for (carros: carro) {
            System.out.println(carros);
        }

        teclado.close();
    }
}
