package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.print("Informe a idade: ");
        idade = teclado.nextInt();

        if (idade >= 5 && idade < 8) {
            System.out.println("Infantil A");
        } else if (idade > 7 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade > 10 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade > 13 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Sênior");
        } else {
            System.out.println("Invalido");
        }

        teclado.close();
    }
}
