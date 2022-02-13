package resolucaoDeExerciciosJava.lista_06_funcoes;

import java.util.Scanner;

public class exercicio01 {

    public static int dobro(int n) {
        return n * 2;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println(dobro(9));

        teclado.close();
    }

}
