package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio36 {
    static void ordena(int vetor[], int tamanho){
        int menor, troca;

        for(int i=0; i<(tamanho-1); i++){
            menor = i;

            for(int j=(i+1); j<tamanho; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }

            }

            if(i != menor){
                troca = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = troca;

            }

        }
    }

    public static void main(String[] args) {
        int[] vetor = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};

        ordena(vetor, 10);


        for(int i=0; i<10; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
