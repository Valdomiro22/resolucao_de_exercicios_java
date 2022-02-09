package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Random;
import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a, b, qtAcertos = 0, resposta;

        Random random = new Random();

        a = random.nextInt(100);
        b = random.nextInt(100);

        System.out.print(a + " + " + b + " = ");
        resposta = teclado.nextInt();

        if (resposta == (a + b)) {
            qtAcertos++;
            System.out.println("Acertou");
        } else {
            System.out.println("Não acertou");
        }

        a = random.nextInt(100);
        b = random.nextInt(100);

        System.out.print(a + " + " + b + " = ");
        resposta = teclado.nextInt();

        if (resposta == (a + b)) {
            qtAcertos++;
            System.out.println("Acertou");
        } else {
            System.out.println("Não acertou");
        }

        a = random.nextInt(100);
        b = random.nextInt(100);

        System.out.print(a + " + " + b + " = ");
        resposta = teclado.nextInt();

        if (resposta == (a + b)) {
            qtAcertos++;
            System.out.println("Acertou");
        } else {
            System.out.println("Não acertou");
        }

        a = random.nextInt(100);
        b = random.nextInt(100);

        System.out.print(a + " + " + b + " = ");
        resposta = teclado.nextInt();

        if (resposta == (a + b)) {
            qtAcertos++;
            System.out.println("Acertou");
        } else {
            System.out.println("Não acertou");
        }

        a = random.nextInt(100);
        b = random.nextInt(100);

        System.out.print(a + " + " + b + " = ");
        resposta = teclado.nextInt();

        if (resposta == (a + b)) {
            qtAcertos++;
            System.out.println("Acertou");
        } else {
            System.out.println("Não acertou");
        }

        System.out.println("Quantidade de acertos: " + qtAcertos);

        teclado.close();
    }
}
