package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio25 {
    public static void main(String[] args) {

        int[] vet = new int[100];
        int qt=0;

//        for(int i = 1; i <= 100; i++){
//            if(i % 7 != 0 && i % 10 != 7){ //i%7 verifica se é multiplo de 7   i%10 verifica o ultimo digito
//                vet[i] = i;
//                qt++;
//        System.out.println("Qt: " + qt);
//                System.out.printf("%d\n", vet[i]);
//            }
//        }

        while (qt < 100) {
            if(qt % 7 != 0 && qt % 10 != 7){ //i%7 verifica se é multiplo de 7   i%10 verifica o ultimo digito
                vet[qt] = qt;
                System.out.printf("%d\n", vet[qt]);
            }

            qt++;
        }
    }
}
