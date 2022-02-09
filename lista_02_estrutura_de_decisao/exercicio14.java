package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double trabalhoLaboratorio, avalicacaoSemestral, exameFinal, media;

        System.out.print("Trabalho de laboratório: ");
        trabalhoLaboratorio = teclado.nextDouble();
        if (trabalhoLaboratorio < 0 || trabalhoLaboratorio > 10) {
            System.out.println("Nota invalida");
        } else {
            System.out.print("Trabalho de avalicação semestral: ");
            avalicacaoSemestral = teclado.nextDouble();
            if (avalicacaoSemestral < 0 || avalicacaoSemestral > 10) {
                System.out.println("Nota invalida");
            } else {
                System.out.print("Trabalho de exame final: ");
                exameFinal = teclado.nextDouble();
                if (exameFinal < 0 || exameFinal > 10) {
                    System.out.println("Nota invalida");
                } else {
                    media = ((trabalhoLaboratorio * 2) + (avalicacaoSemestral * 3) + (exameFinal * 5)) / 10;
                    System.out.println("Média = " + media);

                    if (media < 3) {
                        System.out.println("Reprovado");
                    } else if (media < 5) {
                        System.out.println("Recuperação");
                    } else {
                        System.out.println("Aprovado");
                    }
                }
            }
        }
        teclado.close();
    }
}
