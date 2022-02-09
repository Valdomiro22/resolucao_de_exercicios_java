package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

public class exercicio04 {
    public static void main(String[] args){

        int qt = 1000;

        while (qt <= 100_000) {
            System.out.println(qt);
            qt += 1000;
        }
    }
}
