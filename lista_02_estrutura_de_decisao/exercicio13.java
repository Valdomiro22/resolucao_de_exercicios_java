package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.print("Nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = teclado.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = teclado.nextFloat();

        media = (nota1 + nota2 + (nota3 * 2)) / 4;
        System.out.println("Média = " + media);

        if (media < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        teclado.close();
    }
}
