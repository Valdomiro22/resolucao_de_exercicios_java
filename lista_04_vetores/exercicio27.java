package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio27 {
    public static void main(String[] args) {

        int[] vet = {15, 3, 45, 9, 7, 11, 13, 35, 5, 18};
        int contDivisores;

        for(int i = 0; i < 10; i++){
            contDivisores=0;

            for(int j = vet[i]; j >= 1; j--){
                if(vet[i] % j == 0){
                    contDivisores = contDivisores + 1;
                }
            }

            if(contDivisores == 2){
                System.out.printf("%d é primo\n", vet[i]);
            }else{
                System.out.printf("%d não é numero primo\n", vet[i]);
            }
        }
    }
}
