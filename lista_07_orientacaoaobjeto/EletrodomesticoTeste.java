package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class EletrodomesticoTeste {
    public static void main(String[] args) {

        Eletrodomestico e1 = new Eletrodomestico(false);

        e1.imprimir();

        e1.ligar();
        e1.imprimir();
    }
}
