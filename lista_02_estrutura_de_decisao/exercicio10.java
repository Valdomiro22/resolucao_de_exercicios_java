package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float altura, pesoIdeal;
        char sexo;

        System.out.print("Altura em metros: ");
        altura = teclado.nextFloat();
        System.out.println("Sexo \n[M]-masculino \n[F]-feminino: ");
        sexo = Character.toLowerCase(teclado.next().charAt(0));

        if (sexo == 'f') {
            pesoIdeal = (62.7f * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else if (sexo == 'm') {
            pesoIdeal = (72.7f * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        }

        teclado.close();
    }
}
