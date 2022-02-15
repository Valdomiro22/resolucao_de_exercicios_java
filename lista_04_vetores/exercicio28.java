package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio28 {
    public static void main(String[] args) {

        int[] v = {15, 36, 45, 9, 7, 26, 42, 35, 39, 18};
        int[] v1 = new int[10];
        int[] v2 = new int[10];

        for(int i=0; i<10; i++){
            if(v[i] % 2 == 0){
                v1[i] = v[i];
                System.out.printf("Valores de v1 (pares): %d\n", v1[i]);
            }
        }

        for(int i=0; i<10; i++){
            if(v[i] % 2 != 0){
                v2[i] = v[i];
                System.out.printf("Valores de v2 (impares): %d\n", v2[i]);
            }
        }
    }
}
