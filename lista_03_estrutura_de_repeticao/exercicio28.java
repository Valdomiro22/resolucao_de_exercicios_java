package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n, i, j, num, fatorial;
        double  e = 1.0;

        System.out.println("Digite um numero: ");
        n = teclado.nextInt();

        for(i=1; i<=n; ++i){
            num = (int) (1.0/i);
            fatorial = 1;

            for(j=num; j>0; --j){ //calculando o fatorial de 1/i
                fatorial*=num;
            }

            e += fatorial; //"E" é somado ao fatorial da divisão de 1 por i
        }

        System.out.println("Valor de E: " + e);
        teclado.close();
    }
}
