package resolucaoDeExerciciosJava.lista_03_estrutura_de_repeticao;

public class exercicio02 {
    public static void main(String[] args){

        System.out.println("For");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("\n---------------------");
        System.out.println("While");
        int qt = 1;
        while (qt <= 100) {
            System.out.println(qt);
            qt++;
        }

        System.out.println("\n---------------------");
        System.out.println("do while");
        qt = 1;
        do {
            System.out.println(qt);
            qt++;
        } while (qt <= 100);
    }
}
