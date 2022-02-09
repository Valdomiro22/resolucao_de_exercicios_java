package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

public class exercicio01 {
    public static void main(String[] args){

        int numeros = 1, quantidade = 0;

        while (quantidade < 5) {
            if (numeros % 3 == 0) {
                quantidade++;
                System.out.println(numeros);
            }
            numeros++;
        }
    }
}
