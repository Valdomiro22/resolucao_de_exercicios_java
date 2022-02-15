package resolucaoDeExerciciosJava.lista_04_vetores;

import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,coef=0;

        System.out.println("digite um inteiro n: ");
        n = teclado.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(i==0 || j==0){
                    coef = 1;
                }else{
                    coef = coef * (i-j+1)/j ;
                }

                System.out.printf("%d ", coef);

            }

            System.out.printf("\n");
        }

        teclado.nextInt();
    }
}
