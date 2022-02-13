package resolucaoDeExerciciosJava.lista_06_funcoes;

import java.util.Scanner;

public class exercicio03 {

    public static int verificaNumero(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println(verificaNumero(3));
        System.out.println(verificaNumero(-3));
        System.out.println(verificaNumero(0));

        teclado.close();
    }
}
