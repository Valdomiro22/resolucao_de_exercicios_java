package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio35 {
    public static void main(String[] args) {

        int[] vetorA = {15, 0, 45, 9, 0, 22, 42, 0, 49, 114};
        int[] vetorB = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] soma = new int[10];
        int guarda10 = 0;


        for(int i=0; i<5; i++){
            soma[i] = vetorA[i] + vetorB[i];

            if(soma[i] > 9){
                guarda10 = 10;
                soma[i] = soma[i] - guarda10;
                soma[i+1] = vetorA[i+1] + vetorB[i+1] + 1;

            }else if(soma[i] <= 9){
                guarda10 = 0;
                soma[i] = soma[i] - guarda10;
                soma[i+1] = vetorA[i+1] + vetorB[i+1];
            }
        }


        for (int i : soma) {
            System.out.print(i + " ");
        }

    }
}
