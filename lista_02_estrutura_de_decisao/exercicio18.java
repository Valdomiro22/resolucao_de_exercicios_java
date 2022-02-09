package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int soma, subtracao, multiplicacao, opcao, vl1, vl2;
        float divisao;

        System.out.println("Escolha uma opção");
        System.out.println("[1]-Soma");
        System.out.println("[2]-Subtração");
        System.out.println("[3]-Multiplicação");
        System.out.println("[4]-Divisão");
        System.out.print("Opção: ");
        opcao = teclado.nextInt();
        if (opcao < 1 || opcao > 4) {
            System.out.println("Opção invalida");
        } else {
            System.out.println("Informe o primeiro valor: ");
            vl1 = teclado.nextInt();
            System.out.println("Informe o segundo valor: ");
            vl2= teclado.nextInt();
            if (vl2 == 0 && opcao == 4) {
                System.out.println("Finalizando! Imposivel dividir po zero");
            } else {
                if (opcao == 1) {
                    soma = vl1 + vl2;
                    System.out.println(vl1 + " + " + vl2 + " = " + soma);
                } else  if (opcao == 2) {
                    subtracao = vl1 - vl2;
                    System.out.println(vl1 + " - " + vl2 + " = " + subtracao);
                } else  if (opcao == 3) {
                    multiplicacao = vl1 * vl2;
                    System.out.println(vl1 + " * " + vl2 + " = " + multiplicacao);
                } else{
                    divisao = (float) vl1 / vl2;
                    System.out.println(vl1 + " / " + vl2 + " = " + divisao);
                }
            }
        }
        teclado.close();
    }
}
