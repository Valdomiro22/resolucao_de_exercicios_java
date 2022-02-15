package resolucaoDeExerciciosJava.lista_04_vetores;

import java.awt.desktop.SystemEventListener;

public class exercicio33 {
    public static void main(String[] args) {

        int[] x = {15, 0, 45, 9, 0, 22, 42, 0, 49, 114, 432, 0, 76, 98, 35};
        int tamanhoNovoVetor = 0;

        for (int i : x) {
            System.out.print(i + " ");
        }

        // Cria um novo vetor para receber os valores validos
        for(int j=0; j<15; j++){
            if(x[j] == 0){
            }else{
                x[tamanhoNovoVetor] = x[j];
                tamanhoNovoVetor++;
            }

        }

        // Imprime o resultado
        System.out.printf("\n");
        for(int i=0; i<tamanhoNovoVetor; i++){
            System.out.print(x[i] + " ");
        }

    }
}
