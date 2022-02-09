package resolucaoDeExerciciosJava.lista_07_classes;

public class TelevisaoTeste {

    public static void main(String[] args) {

        ControleRemoto com = new ControleRemoto(34, 18, 100, 432);

        com.imprimir();
        com.aumentarCanal();
        com.aumentarCanal();
        com.aumentarVolume();
        com.aumentarVolume();
        com.aumentarVolume();
        com.setCanal(87);

        System.out.println("-----------------------------------");
        com.imprimir();
    }
}
